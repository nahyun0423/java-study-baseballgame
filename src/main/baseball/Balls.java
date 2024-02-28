package baseball;

import java.util.ArrayList;
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

    public List<Ball> makeBalls(List<Integer> list) {
        if (list.size() != 0) {
            Ball first = new Ball(1, list.get(0));
            Ball second = new Ball(2, list.get(1));
            Ball third = new Ball(3, list.get(2));
            inputBall(first, second, third);
            return balls;
        }
        return balls;
    }
}