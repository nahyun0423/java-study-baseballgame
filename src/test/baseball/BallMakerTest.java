package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class BallMakerTest {
    private BallMaker bm = new BallMaker();
    @Test
    @DisplayName("입력문자열_분리")
    void 입력문자열_List로_분리() {
        String input = "423";

        List<Integer> list = bm.splitStr(input);

        assertThat(list.get(0)).isEqualTo(4);
        assertThat(list.get(1)).isEqualTo(2);
        assertThat(list.get(2)).isEqualTo(3);
    }

    @Test
    @DisplayName("Ball리스트로_변환_검증")
    void Ball리스트로_변환_검증() {
        List<Integer> list = asList(2, 4, 8);

        Ball expected1 = new Ball(1, 2);
        Ball expected2 = new Ball(2, 4);
        Ball expected3 = new Ball(3, 8);

        List<Ball> balls = bm.integerToBall(list);

        assertThat(balls.get(0)).isEqualTo(expected1);
        assertThat(balls.get(1)).isEqualTo(expected2);
        assertThat(balls.get(2)).isEqualTo(expected3);
    }
}