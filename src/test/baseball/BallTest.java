package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    @DisplayName("숫자_1_9_검증")
    void 숫자_1_9_검증() {
        assertThat(Ball.validNo(9)).isTrue();
        assertThat(Ball.validNo(1)).isTrue();
        assertThat(Ball.validNo(0)).isFalse();
        assertThat(Ball.validNo(10)).isFalse();
    }

    @Test
    @DisplayName("사용자_숫자_중복_검증")
    void 사용자_숫자_중복_검증() {
        List<Integer> noDuplist = asList(1, 2, 3);
        List<Integer> dupList = asList(2,3,2);

        assertThat(Ball.hasDuplicate(noDuplist)).isFalse();
        assertThat(Ball.hasDuplicate(dupList)).isTrue();
    }
}