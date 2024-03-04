package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomTest {
    private Random random = new Random();

    @Test
    @DisplayName("랜덤숫자_사이즈_검증")
    void 랜덤숫자_사이즈_검증(){
        List<Integer> randomNum = random.generateRandom();
        System.out.println(randomNum);
        assertThat(randomNum.size()).isEqualTo(3);
    }
}
