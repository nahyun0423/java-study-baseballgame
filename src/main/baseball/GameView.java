package baseball;

import java.util.Scanner;

public class GameView {

    public void startView() {
        System.out.println("게임 시작!");
    }

    public void playView() {
        System.out.println("1-9 사이의 세 자리 수 입력 : ");
    }

    public void judgeView(int countStrike, int countBall) {
        if (countStrike > 0 || countBall > 0){
            System.out.println(countStrike + " 스트라이크, " + countBall + " 볼");
        }
        if (countStrike == 0 && countBall == 0)
        System.out.println("낫싱");
    }

    public void invalidInputView() {
        System.out.println("유효하지 않은 입력입니다. 다시 입력해주세요.");
    }

    public void endOrRestartView(boolean isPlayerWinner) {
        if (isPlayerWinner) {
            System.out.println("성공!");
        }
        System.out.println("게임을 종료하려면 1을, 재시작하려면 2를 입력하세요 : ");
    }

    public void endView() {
        System.out.println("게임을 종료합니다.");
    }
}