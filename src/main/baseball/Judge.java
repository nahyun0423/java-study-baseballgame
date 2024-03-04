package baseball;

import java.util.List;
import java.util.stream.IntStream;

import static baseball.Random.SIZE;

public class Judge {
    private int countBall = 0;
    private int countStrike = 0;

    Judge() {
    }

    Judge(int countBall, int countStrike) {
        this.countBall = countBall;
        this.countStrike = countStrike;
    }

    public JudgeStatus judgeBall(Ball ball1, Ball ball2) {
        if (ball1.equals(ball2)) {
            countStrike++;
            return JudgeStatus.STRIKE;
        }
        if (ball1.ballNo == ball2.ballNo) {
            countBall++;
            return JudgeStatus.BALL;
        }
        return JudgeStatus.NOTHING;
    }

    public Judge judgeBalls(List<Ball> balls1, List<Ball> balls2) {
        IntStream.range(0, SIZE)
                .forEach(i -> {
                    JudgeStatus result = judgeBall(balls1.get(0), balls2.get(i));
                    this.countStrike += (result == JudgeStatus.STRIKE) ? 1 : 0;
                    this.countBall += (result == JudgeStatus.BALL) ? 1 : 0;
                });

        IntStream.range(0, SIZE)
                .forEach(i -> {
                    JudgeStatus result = judgeBall(balls1.get(1), balls2.get(i));
                    this.countStrike += (result == JudgeStatus.STRIKE) ? 1 : 0;
                    this.countBall += (result == JudgeStatus.BALL) ? 1 : 0;
                });

        IntStream.range(0, SIZE)
                .forEach(i -> {
                    JudgeStatus result = judgeBall(balls1.get(2), balls2.get(i));
                    this.countStrike += (result == JudgeStatus.STRIKE) ? 1 : 0;
                    this.countBall += (result == JudgeStatus.BALL) ? 1 : 0;
                });
        return new Judge(countStrike, countBall);
    }
}
