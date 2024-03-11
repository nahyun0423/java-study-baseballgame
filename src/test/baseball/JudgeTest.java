package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeTest {
    @Test
    @DisplayName("Judge_객체_생성")
    void Judge_객체_생성() {
        List<Ball> balls1 = Arrays.asList(new Ball(1, 2), new Ball(2, 4), new Ball(3, 8));
        List<Ball> balls2 = Arrays.asList(new Ball(1, 2), new Ball(5, 6), new Ball(3, 8));
        Judge judge = new Judge(0,0);

        Judge result = judge.countResult(balls1, balls2);

        assertThat(result.getCountStrike()).isEqualTo(2);
        assertThat(result.getCountBall()).isEqualTo(0);
    }

    @Test
    void STRIKE() {
        Ball ball1 = new Ball(1, 2);
        Ball ball2 = new Ball(1, 2);
        Judge judge = new Judge(0,0);

        JudgeStatus result = judge.judgeBall(ball1, ball2);

        assertThat(result).isEqualTo(JudgeStatus.STRIKE);
    }

    @Test
    void BALL() {
        Ball ball1 = new Ball(1, 2);
        Ball ball2 = new Ball(5, 2);
        Judge judge = new Judge(0,0);

        JudgeStatus result = judge.judgeBall(ball1, ball2);

        assertThat(result).isEqualTo(JudgeStatus.BALL);
    }

    @Test
    void NOTHING() {
        Ball ball1 = new Ball(1, 2);
        Ball ball2 = new Ball(5, 6);
        Judge judge = new Judge(0,0);

        JudgeStatus result = judge.judgeBall(ball1, ball2);

        assertThat(result).isEqualTo(JudgeStatus.NOTHING);
    }
}
