package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BallsMaker {
    private Balls balls = new Balls();

    public List<Integer> splitStr(String input) {
        return Arrays.stream(input.split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public List<Ball> integerToBall(List<Integer> inputList) {
        return balls.makeBallsList(
                new Ball(1, inputList.get(0)),
                new Ball(2, inputList.get(1)),
                new Ball(3, inputList.get(2))
        );
    }
}