package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    private Ball ball = new Ball(0,0);

    @Test
    @DisplayName("숫자_1_9_검증")
    void 숫자_1_9_검증() {
        assertThat(ball.validNo(9)).isTrue();
        assertThat(ball.validNo(1)).isTrue();
        assertThat(ball.validNo(0)).isFalse();
        assertThat(ball.validNo(10)).isFalse();
    }
}