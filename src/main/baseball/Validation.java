package baseball;

import java.util.List;

public class Validation {
    private BallsMaker ballsMaker;

    public Validation(BallsMaker ballsMaker) {
        this.ballsMaker = ballsMaker;
    }

    public boolean isValidInput(String input) {
        if (input.length() != Random.SIZE) {
            return false;
        }

        List<Integer> playerNumbers = ballsMaker.splitStr(input);

        return playerNumbers.stream().allMatch(Ball::validNo) && !Ball.hasDuplicate(playerNumbers);
    }
}
