package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputTest {
    private Input input = new Input();

    @Test
    @DisplayName("입력값_테스트")
    void 입력값_테스트() {
        int inputData = 123;
        List<Integer> playerList = new ArrayList<>();
        playerList = input.inputBall(inputData);

        assertThat(playerList.get(0)).isEqualTo(1);
        assertThat(playerList.get(1)).isEqualTo(2);
        assertThat(playerList.get(2)).isEqualTo(3);
    }
}