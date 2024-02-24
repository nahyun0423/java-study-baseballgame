package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    @DisplayName("3스트라이크_성공")
    void 3스트라이크_성공(){
        assertThat(Game.isGameOver(3)).isTrue();
        assertThat(Game.isGameOver(2)).isFalse();
        assertThat(Game.isGameOver(1)).isFalse();
    }

    @Test
    @DisplayName("게임_다시_시작")
    void 게임_다시_시작(){

    }


    @Test
    @DisplayName("게임_종료")
    void 게임_종료(){

    }
}
