package test;

import main.GameResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameResultTest {

    @Test
    public void testIsGameOver() {
        GameResult gameResult1 = new GameResult(3, 0, true);
        assertTrue(gameResult1.isGameOver());

        GameResult gameResult2 = new GameResult(1, 2, false);
        assertFalse(gameResult2.isGameOver());
    }

    @Test
    public void testGetResultString() {
        GameResult gameResult = new GameResult(1, 2, false);
        assertEquals("1 스트라이크 2 볼", gameResult.getResultString());
    }
}
