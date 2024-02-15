package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ore.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BallTest {

    @Test
    @DisplayName("야구_숫자_중복_검증")
    void 야구_숫자_중복_검증() {
        List<Integer> default1 = Arrays.asList(1, 3, 3);
        List<Integer> default2 = Arrays.asList(1, 2, 3);
        assertThat(ValidationUtils.hasDuplicate(default1)).isTrue();
        assertThat(ValidationUtils.hasDuplicate(default1)).isTrue();
    }

    @Test
    @DisplayName("야구_숫자_중복_검증2")

}
