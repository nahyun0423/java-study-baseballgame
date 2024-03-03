package baseball;

public class GameView {

    public void startView() {
        System.out.println("게임 시작!");
    }

    public void playView() {
        System.out.println("1-9사이의 세자리 수 입력 : ");
    }

    public void endOrRestartView() {
        System.out.println("성공 !");
        System.out.println("게임을 종료하려면 1을, 재시작하려면 2를 입력하세요 : ");
    }

    public void endView(){
        System.out.println("게임을 종료합니다.");
    }
}