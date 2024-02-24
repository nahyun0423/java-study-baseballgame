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

    public List<Ball> validSequence(List<Ball> balls) {
        if (isFrontSeq(0, 1)) {
            Collections.swap(balls, 0, 1);
        }
        if (isFrontSeq(0, 2)) {
            Collections.swap(balls, 0, 2);
        }
        if (isFrontSeq(1, 2)) {
            Collections.swap(balls, 1, 2);
        }
        return balls;
    }

    private boolean isFrontSeq(int front, int back) {
        if (balls.get(front).getPosition() > balls.get(back).getPosition()) {
            return true;
        }
        return false;
    }

    public List<Ball> getBalls() {
        return balls;
    }
}