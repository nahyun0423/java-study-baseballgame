package test;

import main.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberTest {
    @Test
    void 중복되는지_확인() {
        int[] arr1 = {1, 1, 2};
        Number number = new Number();
        assertTrue(number.checkDuplicate(1, arr1));
    }
}
