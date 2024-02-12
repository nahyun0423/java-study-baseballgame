package main;

public class Compare {
    Number number = new Number();

    private int sameAmount = checkSameNum(number.getRandomNum(), number.getPlayerNum());
    private int samePositionAmount = checkSamePosition(number.getRandomNum(), number.getPlayerNum());

    private int count;

    public int checkSameNum(int[] randomNum, int[] playerNum) {
        count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                count += countNum(randomNum, i, playerNum, j);
            }
        }
        return count;
    }

    public int checkSamePosition(int[] randomNum, int[] playerNum) {
        count = 0;
        for (int i = 0; i < 3; i++) {
            count += countNum(randomNum, i, playerNum, i);
        }
        return count;
    }

    private int countNum(int[] randomNum, int i, int[] playerNum, int j) {
        if (randomNum[i] == playerNum[j]) {
            return 1;
        }
        return 0;
    }

    public String printResult(int sameAmount, int samePositionAmount) {
        int ball = sameAmount - samePositionAmount;
        int strike = samePositionAmount;

        if (ball == 0 && strike == 0) {
            return "낫싱";
        }
        if (ball == 0 && strike > 0) {
            return strike + "스트라이크";
        }
        if (ball > 0 && strike == 0) {
            return ball + "볼";
        }
            return strike + "스트라이크 " + ball + "볼";
    }

    public int getSamePositionAmount() {
        return samePositionAmount;
    }

    public int getSameAmount(){
        return sameAmount;
    }
}
