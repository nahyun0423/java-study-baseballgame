package baseball;

import java.util.List;

import static baseball.RandomBall.SIZE;

public class Result {
    Balls balls = new Balls();
    private Result result;

    private int ball = 0;
    private int strike = 0;

    public Result(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public String compare(List<Integer> player, List<Integer> random) {
        for (int i = 0; i < SIZE; i++) {
            Ball playerBall = balls.makeBalls(player).get(i);
            Ball randomBall = balls.makeBalls(random).get(i);

            BallStatus status = playerBall.play(randomBall);
            makeResult(status);
        }
        return resultView(result);
    }

    public void makeResult(BallStatus status) {
        if (status.equals(BallStatus.STRIKE)) {
            this.ball++;
        }
        if (status.equals(BallStatus.BALL)) {
            this.strike++;
        }
    }

    public String resultView(Result result) {
        String resultStr = "";

        if (strike > 0) {
            resultStr += strike + "스트라이크 ";
        }
        if (ball > 0) {
            resultStr += ball + "볼";
        }
        if (strike == 0 || ball == 0 ) {
            resultStr += "낫싱";
        }
        return resultStr;
    }
}