package baseball;

import java.util.ArrayList;
import java.util.List;

public class BallMaker {
    private Balls balls = new Balls();

    public List<Integer> splitStr(String input) {
        String[] inputNum = input.split("");
        List<Integer> inputList = new ArrayList<>();

        for (String str : inputNum) {
            inputList.add(Integer.valueOf(str));
        }
        return inputList;
    }

    public List<Ball> integerToBall(List<Integer> inputList) {
        Ball[] ball = new Ball[inputList.size()];

        for (int i = 0; i < inputList.size(); i++) {
            ball[i] = new Ball(i + 1, inputList.get(i));
        }

        return balls.makeBallsList(ball[0], ball[1], ball[2]);
    }
}