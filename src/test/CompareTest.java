package test;

import main.Compare;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareTest {
    private Compare compare;
    @BeforeEach
    void beforeEach() {
        compare = new Compare();
    }

    @Test
    void 동일한_숫자의수_테스트() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,1,5};

        assertEquals(2, compare.checkSameNum(arr1, arr2));
    }

    @Test
    void 같은자리_숫자의수_테스트() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,5};

        assertEquals(2, compare.checkSamePosition(arr1, arr2));
    }

    @Test
    void 결과출력_테스트() {
        int sameAmount = 2;
        int samePositionAmount = 1;
        assertEquals("1스트라이크 1볼", compare.printResult(sameAmount, samePositionAmount));

        sameAmount = 2;
        samePositionAmount = 0;
        assertEquals("2볼", compare.printResult(sameAmount, samePositionAmount));

        sameAmount = 0;
        samePositionAmount = 0;
        assertEquals("낫싱", compare.printResult(sameAmount, samePositionAmount));
    }
}
