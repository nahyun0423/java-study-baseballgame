package main;

public class Result {
    Compare compare = new Compare();

    public String judgeResult (int ball, int strike) {
        String ballStr = "";
        String strikeStr = "";

        if (ball == 0 || strike == 0) {
            return "낫싱";
        }
        if (ball > 0) {
            ballStr = ball + "볼 ";
        }
        if (strike > 0) {
            strikeStr = strike + "스트라이크";
        }

        return ballStr + strikeStr;
    }
}
