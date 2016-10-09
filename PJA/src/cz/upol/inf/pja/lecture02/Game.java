
package cz.upol.inf.pja.lecture02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;


@Named(value = "game")
@SessionScoped
public class Game implements java.io.Serializable {

    // automaticke provazani na application-scope bean
    @Inject private GuessWordApp app;
    
    /** hadane slovo */
    private String secretWord = "";
    
    /** seznam jiz uzitych slov */
    private final List<Character> history = new ArrayList<>();

    
    public Game() {
    }
    
    /**
     * Inicializace hry -- volba nahodneho slova
     */
    public void initializeGame() {
        List<String> words = app.getWords();
        int rnd = (new Random()).nextInt(words.size());
        secretWord = words.get(rnd);

        
        history.clear();
        app.setGameCount(app.getGameCount() + 1);
        app.setTurn(0);
    }
    
    /**
     * Zavolanim metody se provede jeden pokus o uhadnuti znaku
     */
    public void addCharacter(char c) {
        history.add(c);
    }
    
    /**
     * @return vraci seznam jiz uhadnutych znaku, pokud znak jeste nebyl uhadnut,
     * je vracen symbol '?'
     */
    public List<Character> getCharacters() {
        List<Character> result = new ArrayList<>();
        for (int i = 0; i < secretWord.length(); i++) {
            char c = secretWord.charAt(i);
            if (history.contains(c)) result.add(c);
            else result.add('?');
            
        }
        return Collections.unmodifiableList(result);
    }
    
    public List<Character> getHistory() {
        return Collections.unmodifiableList(history);
    }
    
    public String getSecretWord() {
        return secretWord;
    }

    public int getTurn() { return app.getTurn(); }

    public void incTurn() { app.incTurn(); }
}
