package baseball;

import java.util.Scanner;

public class GameView {
    Scanner scan = new Scanner(System.in);

    public void startView() {
        System.out.println("게임 시작!");
    }

    public void playView() {
        System.out.println("1-9사이의 세자리 수 입력 : ");
        String playerInput = scan.nextLine();
    }

    public void judgeView() {
        System.out.println();
    }

    public void endOrRestartView() {
        System.out.println("성공 !");
        System.out.println("게임을 종료하려면 1을, 재시작하려면 2를 입력하세요 : ");
        int endOrRestart = scan.nextInt();
    }

    public void endView() {
        System.out.println("게임을 종료합니다.");
    }
}