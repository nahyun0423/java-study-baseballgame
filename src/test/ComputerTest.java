package test;

import main.Computer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {
    private Computer computer;

    @BeforeEach
    void beforeEach() {
        computer = new Computer();
    }

    @Test
    @DisplayName("랜덤 숫자가 3자리인지 테스트")
    public void testRandomNumberthree() {
        computer.generateRandomNumber();
        assertEquals(3, computer.getRandomNumber().size());
    }

    @Test
    @DisplayName("랜덤 숫자 중복 테스트")
    public void testRandomNumberDuplicate() {
        computer.generateRandomNumber();
        Stream<Integer> stream = computer.getRandomNumber().stream();
        int result = (int) stream.distinct().count();
        assertEquals(3, result);
    }

    @Test
    public void testCompare() {
        
    }
}
