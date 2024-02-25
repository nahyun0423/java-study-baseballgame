package baseball;

import java.util.*;

import static baseball.RandomBall.SIZE;

public class Input {
    private List<Integer> playerList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public List<Integer> inputBall() {
        System.out.print("세자리 수 입력 : ");
        int input = scanner.nextInt();
        int length = (int) (Math.log10(input) + 1);
        playerList = Arrays.asList(input / 100, input % 100 / 10, input % 10);

        if (ValidationUtils.hasDuplicate(playerList) == true) {
            System.out.println("중복된 숫자 있음! 다시 입력하세요");
            inputBall();
        }

        if (length != SIZE) {
            System.out.println("세자리 수 아님! 다시 입력하세요");
            inputBall();
        }

        return playerList;
    }
}
