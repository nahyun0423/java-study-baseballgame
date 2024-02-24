package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilsTest {
    @Test
    @DisplayName("야구_숫자_1_9_검증")
    void 야구_숫자_1_9_검증() {
        assertThat(ValidationUtils.validNo(9)).isTrue();
        assertThat(ValidationUtils.validNo(1)).isTrue();
        assertThat(ValidationUtils.validNo(0)).isFalse();
        assertThat(ValidationUtils.validNo(10)).isFalse();
    }

    @Test
    @DisplayName("야구_숫자_중복_검증")
    void 야구_숫자_중복_검증() {
        List<Integer> default1 = Arrays.asList(1, 3, 3);
        List<Integer> default2 = Arrays.asList(1, 2, 3);
        assertThat(ValidationUtils.hasDuplicate(default1)).isTrue();
        assertThat(ValidationUtils.hasDuplicate(default2)).isFalse();
    }

    @Test
    @DisplayName("야구_숫자_중복_검증2")
    void 야구_숫자_중복_검증2() {
        List<Integer> default1 = Arrays.asList(1, 3, 3);
        List<Integer> default2 = Arrays.asList(1, 2, 3);
        assertThat(ValidationUtils.hasDuplicate2(default1)).isTrue();
        assertThat(ValidationUtils.hasDuplicate2(default2)).isFalse();
    }

    @Test
    @DisplayName("Set_테스트")
    void SET_테스트() {
        List<Integer> default1 = Arrays.asList(1, 3, 3);
        List<Integer> default2 = Arrays.asList(1, 2, 3);

        assertThat(new HashSet<>(default1).size()).isEqualTo(2);
        assertThat(new HashSet<>(default2).size()).isEqualTo(3);
    }

    @Test
    @DisplayName("문자_입력_예외발생")
    void 문자_입력_예외발생() {
        List<Integer> integerList = new ArrayList<>();

        Exception exception = assertThrows(ClassCastException.class, ()-> {
            integerList.add(Integer.valueOf("a"));
        });

        String message = exception.getMessage();
        assertThat(message).isEqualTo("숫자만 입력해주세요");
    }
}