package baseball;

import java.util.List;

public class Validation {
    private Balls balls;

    public Validation(Balls balls) {
        this.balls = balls;
    }

    public void validateInput(String input) {
        if (input.length() != Random.SIZE) {
            throw new IllegalArgumentException("입력은 " + Random.SIZE + "자리여야 합니다.");
        }

        List<Integer> playerNumbers = balls.splitStr(input);

        if (playerNumbers.stream().anyMatch(num -> !Ball.validNo(num)) || Ball.hasDuplicate(playerNumbers)) {
            throw new IllegalArgumentException("유효하지 않은 입력입니다. 다시 입력해주세요.");
        }
    }

    public void validateInputEnd(int input) {
        if (input != 1 && input != 2) {
            throw new IllegalArgumentException("유효하지 않은 입력입니다. 1과 2만 입력해주세요.");
        }
    }
}