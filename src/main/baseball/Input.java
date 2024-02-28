package baseball;

import java.util.*;

import static baseball.RandomBall.SIZE;

public class Input {
    private List<Integer> playerList = new ArrayList<>();

    public List<Integer> inputBall(int input) {
        int length = (int) (Math.log10(input) + 1);

        playerList = Arrays.asList(input / 100, input % 100 / 10, input % 10);

        if (ValidationUtils.hasDuplicate(playerList) == true) {
            System.out.println("중복된 숫자 있음! 다시 입력하세요");
            inputBall(input);
        }

        if (length != SIZE) {
            System.out.println("세자리 수 아님! 다시 입력하세요");
            inputBall(input);
        }

        return playerList;
    }
}
