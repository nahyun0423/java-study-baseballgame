package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List<Ball> balls;

    public Balls() {
        this.balls = new ArrayList<>();
    }

    public List<Ball> createBalls(List<Integer> list) {
        balls.clear();
        for (int i = 0; i < list.size(); i++) {
            Ball ball = new Ball(i + 1, list.get(i));
            balls.add(ball);
        }
        return balls;
    }
}