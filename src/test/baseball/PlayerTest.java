package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;

public class PlayerTest {
    private Player player = new Player();

    @Test
    @DisplayName("입력문자열_분리")
    void 입력문자열_List로_분리() {
        String input = "123";

        List<Integer> list = player.splitStr(input);

        assertThat(list.get(0)).isEqualTo(1);
        assertThat(list.get(1)).isEqualTo(2);
        assertThat(list.get(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("사용자_숫자_중복_검증")
    void 사용자_숫자_중복_검증() {
        List<Integer> noDuplist = asList(1, 2, 3);
        List<Integer> dupList = asList(2,3,2);

        assertThat(player.hasDuplicate(noDuplist)).isFalse;
        assertThat(player.hasDuplicate(dupList)).isTrue;
    }
}
