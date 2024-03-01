package baseball;

import java.util.List;

import static baseball.RandomBall.SIZE;

public class Result {
    private Balls balls = new Balls();
    private int ball = 0;
    private int strike = 0;
    private Result result;

    public Result(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public String compare(List<Integer> player, List<Integer> random) {
        List<Ball> playerBalls = balls.createBalls(player);
        List<Ball> randomBalls = balls.createBalls(random);
        result = new Result(0,0);

        for (int i = 0; i < SIZE; i++) {
            Ball playerBall = playerBalls.get(i);
            Ball randomBall = randomBalls.get(i);

            BallStatus status = playerBall.play(randomBall);
            makeResult(status);
        }
        return resultView(result);
    }

    public void makeResult(BallStatus status) {
        if (status.equals(BallStatus.STRIKE)) {
            result.ball++;
        }
        if (status.equals(BallStatus.BALL)) {
            result.strike++;
        }
    }

    public String resultView(Result result) {
        String resultStr = "";

        if (result.strike > 0) {
            resultStr += result.strike + "스트라이크 ";
        }
        if (result.ball > 0) {
            resultStr += result.ball + "볼";
        }
        if (result.strike == 0 && result.ball == 0) {
            resultStr += "낫싱";
        }
        return resultStr;
    }
}