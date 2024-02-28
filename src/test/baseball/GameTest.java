package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {
    private Game game = new Game();

    @Test
    @DisplayName(value = "three스트라이크_성공")
    void three스트라이크_성공() {
        assertThat(game.isGameOver("3스트라이크 ")).isTrue();
        assertThat(game.isGameOver("1스트라이크 1볼")).isFalse();
        assertThat(game.isGameOver("3스트라이크 2볼")).isFalse();
        assertThat(game.isGameOver("낫싱")).isFalse();
    }
}
