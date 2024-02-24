package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls() {
        this.balls = new ArrayList<>();
    }

    public List<Ball> inputBall(Ball ball1, Ball ball2, Ball ball3) {
        balls.add(ball1);
        balls.add(ball2);
        balls.add(ball3);
        return balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }
}