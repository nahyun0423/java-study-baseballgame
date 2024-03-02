package baseball;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class Balls {
    List<Ball> ballsList = new ArrayList<>();

    public List<Ball> makeBalls(Ball ball1, Ball ball2, Ball ball3) {
        ballsList = asList(ball1, ball2, ball3);
        return ballsList;
    }
}
