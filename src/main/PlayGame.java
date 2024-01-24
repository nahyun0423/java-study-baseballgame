package main;

import java.util.Scanner;

public class PlayGame {

    public String inputPlayAgain() {
        Scanner scan = new Scanner(System.in);
        String progress = scan.next();
        return progress;
    }
    public boolean playAgain() {
        if (inputPlayAgain().equals("1")) {
            return true;
        }
        if (inputPlayAgain().equals("2")) {
            return false;
        }
        if (! (inputPlayAgain().equals("2") || inputPlayAgain().equals("2"))) {
            System.out.println("1과 2만 입력해주세요");
            playAgain();
        }
        return false;
    }
}
