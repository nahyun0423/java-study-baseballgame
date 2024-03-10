package baseball;

public class GameView {

    public void startView() {
        System.out.println("게임 시작!");
    }

    public void playView() {
        System.out.println("1-9 사이의 세 자리 수 입력 : ");
    }

    public void judgeView(int countStrike, int countBall) {
        if (countStrike > 0 || countBall > 0) {
            System.out.println(countStrike + " 스트라이크, " + countBall + " 볼");
            return;
        }
        System.out.println("낫싱");
    }

    public void successView() {
        System.out.println("성공!");
    }

    public void endOrRestartView() {
        System.out.println("게임을 종료하려면 1을, 재시작하려면 2를 입력하세요 : ");
    }

    public void endView() {
        System.out.println("게임을 종료합니다.");
    }
}