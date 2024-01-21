package main;

import java.util.Scanner;

public class PlayGame {
    public boolean playAgain() {
        System.out.println("성공! 게임 다시 시작 : 1, 종료 : 2");
        Scanner scan = new Scanner(System.in);
        String progress = scan.next();

        if (progress.equals("1")) {
            return true;
        }
        if (progress.equals("2")) {
            return false;
        }
        if (! (progress.equals("2") || progress.equals("2"))) {
            System.out.println("1과 2만 입력해주세요");
            playAgain();
        }
        return false;
    }
}
