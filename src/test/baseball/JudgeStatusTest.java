package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JudgeStatusTest {

    @Test
    @DisplayName("JudgeStatus_값_불러오기")
    void JudgeStatus_값_불러오기(){
        assertThat(JudgeStatus.STRIKE.status()).isEqualTo("스트라이크");
        assertThat(JudgeStatus.BALL.status()).isEqualTo("볼");
        assertThat(JudgeStatus.NOTHING.status()).isEqualTo("낫싱");
    }
}
