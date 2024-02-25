package baseball;

import java.util.List;

import static baseball.RandomBall.SIZE;

public class Result {
    Balls balls = new Balls();
    private int ball = 0;
    private int strike = 0;

    public Result(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public void makeResult(List<Integer> player, List<Integer> random) {
        for (int i = 0; i < SIZE; i++) {
            Ball playerBall = balls.makeBalls(player).get(i);
            Ball randomBall = balls.makeBalls(random).get(i);
            BallStatus status = playerBall.play(randomBall);
            compare(status);
        }
    }

    public void compare(BallStatus status) {
        if (status.equals(BallStatus.STRIKE)) {
            ball++;
        }
        if (status.equals(BallStatus.BALL)) {
            strike++;
        }
    }
}
