package baseball;

import java.util.ArrayList;
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
        Ball[] ball = new Ball[inputList.size()];

        for (int i = 0; i < inputList.size(); i++) {
            ball[i] = new Ball(i + 1, inputList.get(i));
        }
        return balls.makeBallsList(ball[0], ball[1], ball[2]);
    }
}