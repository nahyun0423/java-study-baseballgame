package baseball;

import java.util.List;
import java.util.stream.IntStream;

public class Judge {
    private int countBall = 0;
    private int countStrike = 0;

    Judge() {
    }

    Judge(int countBall, int countStrike) {
        this.countBall = countBall;
        this.countStrike = countStrike;
    }

    private JudgeStatus judgeBall(Ball ball1, Ball ball2) {
        if (ball1.equals(ball2)) {
            return JudgeStatus.STRIKE;
        }
        if (ball1.getBallNo() == ball2.getBallNo()) {
            return JudgeStatus.BALL;
        }
        return JudgeStatus.NOTHING;
    }

    public Judge result(List<Ball> balls1, List<Ball> balls2) {
        Judge judge = new Judge(0,0);
        for (int j = 0; j < Random.SIZE; j++) {
            judgeBalls(balls1, balls2, j, judge);
        }
        return judge;
    }

    public void judgeBalls(List<Ball> balls1, List<Ball> balls2, int j, Judge judge) {
        IntStream.range(0, Random.SIZE)
                .forEach(i -> {
                    JudgeStatus result = judgeBall(balls1.get(j), balls2.get(i));
                    judge.countStrike += (result == JudgeStatus.STRIKE) ? 1 : 0;
                    judge.countBall += (result == JudgeStatus.BALL) ? 1 : 0;
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