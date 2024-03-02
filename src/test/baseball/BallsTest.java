package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BallsTest {
    private Balls balls = new Balls();

    @Test
    @DisplayName("Ball객체_3개로_BallsList_만들기")
    void Ball객체_3개로_BallsList_만들기() {
        Ball ball1 = new Ball(1,2);
        Ball ball2 = new Ball(2,4);
        Ball ball3 = new Ball(3,8);

        List<Ball> list = balls.makeBalls(ball1, ball2, ball3);

        assertThat(list.get(0)).isEqualTo(ball1);
        assertThat(list.get(1)).isEqualTo(ball2);
        assertThat(list.get(2)).isEqualTo(ball3);
    }
}

