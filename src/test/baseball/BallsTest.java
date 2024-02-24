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
}