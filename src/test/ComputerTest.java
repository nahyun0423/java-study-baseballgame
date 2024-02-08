package test;

import main.Computer;
import main.GameResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    private Computer computer;

    @BeforeEach
    void beforeEach() {
        computer = new Computer();
        computer.generateRandomNumber();
    }

    @Test
    @DisplayName("랜덤 숫자가 3자리인지 테스트")
    public void testRandomNumberthree() {
        assertEquals(3, computer.getRandomNumber().size());
    }

    @Test
    @DisplayName("랜덤 숫자 중복 테스트")
    public void testRandomNumberDuplicate() {
        Stream<Integer> stream = computer.getRandomNumber().stream();
        int result = (int) stream.distinct().count();
        assertEquals(3, result);
    }

    @Test
    @DisplayName("스트라이크가 1 볼이 2일 때")
    public void testCompare() {
        computer.setRandomNumber(Arrays.asList(1, 3, 2));
        List<Integer> playerNumber = Arrays.asList(1, 2, 3);
        GameResult result = computer.compare(playerNumber);

        assertEquals(1, result.getStrike());
        assertEquals(2, result.getBall());
        assertFalse(result.isGameOver());
    }

    @Test
    @DisplayName("스트라이크가 3개일 때")
    public void testCompare_gameOver() {
        computer.setRandomNumber(Arrays.asList(1, 2, 3));
        List<Integer> playerNumber = Arrays.asList(1, 2, 3);
        GameResult result = computer.compare(playerNumber);

        assertEquals(3, result.getStrike());
        assertEquals(0, result.getBall());
        assertTrue(result.isGameOver());
    }
}
