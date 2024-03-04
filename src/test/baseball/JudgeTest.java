package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static baseball.JudgeStatus.*;
import static org.assertj.core.api.Assertions.assertThat;

public class JudgeTest {
    private Judge judge = new Judge();
    private Ball com = new Ball(1, 2);

    @Test
    void strike() {
        Ball player = new Ball(1, 2);
        JudgeStatus status = judge.judgeBall(com, player);
        assertThat(status).isEqualTo(STRIKE);
    }

    @Test
    void ball() {
        Ball player = new Ball(3, 2);
        JudgeStatus status = judge.judgeBall(com, player);
        assertThat(status).isEqualTo(BALL);
    }

    @Test
    void nothing() {
        Ball player = new Ball(1, 3);
        JudgeStatus status = judge.judgeBall(com, player);
        assertThat(status).isEqualTo(NOTHING);
    }

    @Test
    @DisplayName("Balls_비교")
    void Balls_비교() {
        List<Ball> balls1 = new ArrayList<>();
        List<Ball> balls2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            balls1.add(new Ball(i, i + 2)); // 2,3,5
            balls2.add(new Ball(i, i + 1)); // 1,2,3
        }

        Judge judge1 = judge.judgeBalls(balls1, balls2);

        assertThat(judge1).isEqualTo("2볼");
    }
}
