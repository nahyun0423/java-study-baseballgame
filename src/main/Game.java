package main;

import java.util.Scanner;

public class Game {
    Compare compare = new Compare();

    public void playGame() {
        Number number = new Number();

        System.out.println("게임을 시작합니다");
        number.createRandomNum();

        while (!isGameOver()) {
            System.out.println("세자리 숫자를 입력하세요");
            number.inputPlayerNum();
            compare.printResult(compare.getSameAmount(), compare.getSamePositionAmount());
        }
        endGame();
    }

    public void endGame() {
        System.out.println("재시작하려면 1, 종료하려면 2를 입력하세요");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input == 1) {
            playGame();
        }
        if (input == 2) {
            System.out.println("게임을 종료합니다.");
        }
    }

    public boolean isGameOver() {
        if (compare.getSamePositionAmount() == 3) {
            System.out.println("축하합니다 성공입니다.");
            return true;
        }
        return false;
    }
}
