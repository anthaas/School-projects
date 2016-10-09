package cz.upol.inf.pja.lecture02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;


@Named(value = "gameApp")
@ApplicationScoped
public class GuessWordApp implements java.io.Serializable {

    private final String INPUT_TEXT = "Lorem ipsum dolor sit amet consectetur adipiscing elit maecenas vitae facilisis nulla morbi mollis ultricies leo at placerat praesent luctus ac est vitae sodales donec vitae scelerisque ipsum fusce accumsan elit sed lorem fermentum vel hendrerit justo luctus sed sit amet metus et risus fringilla cursus non eu nisi";
    private final List<String> words;
    private int gameCount = 0;
    private int turn = 0;
    
    public GuessWordApp(){
        words = Arrays.asList(INPUT_TEXT.toLowerCase().split(" "));
    }
    
    public List<String> getWords() {
        return Collections.unmodifiableList(words);
    }

    public int getGameCount() {
        return gameCount;
    }

    public void setGameCount(int gameCount) {
        this.gameCount = gameCount;
    }

    public void setTurn(int n) { turn = n; }
    public int getTurn() { return turn; }
    public void incTurn() { turn++; }

}
