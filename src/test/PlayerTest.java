package test;

import main.Player;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    @DisplayName("배열을 List로 변경 테스트")
    public void testMakeList() {
        Player player = new Player();

        List<Integer> result1 = player.makeList("123");
        List<Integer> expected1 = List.of(1, 2, 3);

        assertEquals(expected1, result1);
    }
}
