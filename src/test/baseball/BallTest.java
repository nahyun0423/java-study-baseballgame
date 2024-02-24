package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static baseball.BallStatus.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {
    private Ball com;
    private BallStatus ballStatus;


    @BeforeEach
    void setup() {
        com = new Ball(1, 4);
    }

    @Test
    void nothing() {
        BallStatus status = com.play(new Ball(2, 5));
        assertThat(status).isEqualTo(ballStatus.NOTHING);
    }

    @Test
    void ball() {
        BallStatus status = com.play(new Ball(2, 4));
        assertThat(status).isEqualTo(BALL);
    }

    @Test
    void strike() {
        BallStatus status = com.play(new Ball(1, 4));
        assertThat(status).isEqualTo(STRIKE);
    }
}

