package baseball;

import java.util.List;
import java.util.stream.IntStream;

public class Judge {
    private int countBall = 0;
    private int countStrike = 0;

    Judge(int countBall, int countStrike) {
        this.countBall = countBall;
        this.countStrike = countStrike;
    }

    public JudgeStatus judgeBall(Ball ball1, Ball ball2) {
        if (ball1.equals(ball2)) {
            return JudgeStatus.STRIKE;
        }
        if (ball1.getBallNo() == ball2.getBallNo()) {
            return JudgeStatus.BALL;
        }
        return JudgeStatus.NOTHING;
    }

    public Judge countResult(List<Ball> balls1, List<Ball> balls2) {
        for (int j = 0; j < Random.SIZE; j++) {
            judgeBalls(balls1, balls2, j);
        }
        return this;
    }

    public void judgeBalls(List<Ball> balls1, List<Ball> balls2, int j) {
        IntStream.range(0, Random.SIZE)
                .forEach(i -> {
                    JudgeStatus result = judgeBall(balls1.get(j), balls2.get(i));
                    this.countStrike += (result == JudgeStatus.STRIKE) ? 1 : 0;
                    this.countBall += (result == JudgeStatus.BALL) ? 1 : 0;
                });
    }

    public void resetCounts() {
        this.countStrike = 0;
        this.countBall = 0;
    }

    public int getCountBall() {
        return countBall;
    }

    public int getCountStrike() {
        return countStrike;
    }
}