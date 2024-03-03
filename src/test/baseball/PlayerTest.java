package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    private Player player = new Player();

    @Test
    @DisplayName("숫자_1_9_검증")
    void 숫자_1_9_검증() {
        assertThat(player.validNo(9)).isTrue();
        assertThat(player.validNo(1)).isTrue();
        assertThat(player.validNo(0)).isFalse();
        assertThat(player.validNo(10)).isFalse();
    }

    @Test
    @DisplayName("사용자_숫자_중복_검증")
    void 사용자_숫자_중복_검증() {
        List<Integer> noDuplist = asList(1, 2, 3);
        List<Integer> dupList = asList(2,3,2);

        assertThat(player.hasDuplicate(noDuplist)).isFalse();
        assertThat(player.hasDuplicate(dupList)).isTrue();
    }
}
