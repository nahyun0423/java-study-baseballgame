package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BallsTest {

    @Test
    void splitStr() {
        Balls balls = new Balls();
        List<Integer> result = balls.splitStr("123");

        assertEquals(Arrays.asList(1, 2, 3), result);
    }

    @Test
    void integerToBall() {
        Balls balls = new Balls();
        List<Integer> inputList = Arrays.asList(1, 2, 3);
        List<Ball> result = balls.integerToBall(inputList);

        assertEquals(3, result.size());
        assertEquals(1, result.get(0).getBallNo());
        assertEquals(2, result.get(1).getBallNo());
        assertEquals(3, result.get(2).getBallNo());
    }

    @Test
    void makeBallsList() {
        Balls balls = new Balls();
        Ball ball1 = new Ball(1, 1);
        Ball ball2 = new Ball(2, 2);
        Ball ball3 = new Ball(3, 3);

        List<Ball> result = balls.makeBallsList(ball1, ball2, ball3);

        assertEquals(3, result.size());
        assertEquals(1, result.get(0).getBallNo());
        assertEquals(2, result.get(1).getBallNo());
        assertEquals(3, result.get(2).getBallNo());
    }

    @Test
    void hasDuplicate_validInput() {
        Balls balls = new Balls();
        List<Integer> inputList = Arrays.asList(1, 2, 3);

        assertDoesNotThrow(() -> balls.hasDuplicate(inputList));
    }

    @Test
    void hasDuplicate_invalidInput() {
        Balls balls = new Balls();
        List<Integer> inputList = Arrays.asList(1, 2, 2);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> balls.hasDuplicate(inputList));
        assertEquals("중복된 숫자가 있습니다", exception.getMessage());
    }
}