package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> ballsList = new ArrayList<>();

    public List<Ball> makeBallsList(Ball ball1, Ball ball2, Ball ball3) {
        ballsList.add(ball1);
        ballsList.add(ball2);
        ballsList.add(ball3);

        return ballsList;
    }
}