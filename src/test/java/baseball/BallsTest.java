package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    private Balls balls;

    @BeforeEach
    void setup() {
        balls = new Balls();
    }

    @Test
    @DisplayName("Balls_사이즈_검증")
    void Balls_사이즈_검증() {
        int listSize = balls
                .inputBall(new Ball(1, 4), new Ball(2, 8), new Ball(3, 5))
                .size();
        assertThat(listSize).isEqualTo(3);
    }

    @Test
    @DisplayName("Balls_순서_검증")
    void Balls_순서_검증() {
        int[] arr = new int[3];
        balls.validSequence(balls.inputBall(new Ball(2, 4), new Ball(3, 8), new Ball(1, 5)));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = balls
                    .getBalls()
                    .get(i)
                    .getPosition();
        }
        assertThat(arr[0]).isEqualTo(1);
        assertThat(arr[1]).isEqualTo(2);
        assertThat(arr[2]).isEqualTo(3);
    }
}