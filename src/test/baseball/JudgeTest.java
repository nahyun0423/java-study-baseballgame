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
    @DisplayName("Balls_비교")
    void Balls_비교() {
        List<Ball> balls1 = new ArrayList<>();
        List<Ball> balls2 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            balls1.add(new Ball(i, i + 2)); // 2,3,5
            balls2.add(new Ball(i, i + 1)); // 1,2,3
        }

        Judge judge1 = judge.result(balls1, balls2);

        assertThat(judge1.getCountBall()).isEqualTo(2);
        assertThat(judge1.getCountStrike()).isEqualTo(0);
    }
}
