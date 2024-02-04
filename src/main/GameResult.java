package main;

public class GameResult {
    private int strike;
    private int ball;
    private boolean gameOver;

    public GameResult(int strike, int ball, boolean gameOver) {
        this.strike = strike;
        this.ball = ball;
        this.gameOver = gameOver;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public String getResultString() {
        return strike + " 스트라이크, " + ball + " 볼";
    }
}
