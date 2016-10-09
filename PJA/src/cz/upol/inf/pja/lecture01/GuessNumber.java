
package cz.upol.inf.pja.lecture01;

import java.io.Serializable;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;


public class GuessNumber implements Serializable {
    
    private final int secretValue = (new Random()).nextInt(1000);
    private final List<Integer> history = new ArrayList<>();
    private GameStatus status = GameStatus.IN_PROGRESS;
    
    public int guess(int value) {
        if (history.size() > 10) status = GameStatus.GAME_OVER;
        if (value == secretValue) status = GameStatus.WON;
        history.add(value);
        return value - secretValue;
    }
    
    public List<Integer> getHistory() {
        return history;
    }
    
    public GameStatus getStatus() {
        return status;
    }
    
    
    public static enum GameStatus {
        IN_PROGRESS,
        GAME_OVER,
        WON
    }
    
}
