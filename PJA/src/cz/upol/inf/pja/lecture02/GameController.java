
package cz.upol.inf.pja.lecture02;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@Named(value = "gameController")
@RequestScoped
public class GameController {

    // provede automaticke provazani s prislousnou session-bean
    @Inject private Game game;
    
    private String inputChar;
    
    public GameController() {
    }
    
    public String startNewGame() {
        game.initializeGame();
        
        return "game-page"; // prejde na stranku game-page
    }
    
    /**
     * Akce, ktera je vyvolana, pokud se uzivatel pokusil uhadnout jeden znak
     * @return stranku, kterou se ma pokracovat
     */
    public String guess() {
        game.incTurn();
        game.addCharacter(inputChar.charAt(0));
        inputChar = "";
        if (game.getTurn() > 25) return "loose";
        if (game.getCharacters().contains('?')) return "game-page";
        return "win"; // prejde na stranku win
    }

    public String getInputChar() {
        return inputChar;
    }

    public void setInputChar(String inputChar) {
        this.inputChar = inputChar;
    }
}
