package main;

import java.util.List;
import java.util.Scanner;

public class Game {
    private Player player;
    private Computer computer;
    private Scanner scanner;


    public Game() {
        this.player = new Player();
        this.computer = new Computer();
        this.scanner = new Scanner(System.in);
    }

    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다!");

        do {
            playGame();
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        } while (scanner.nextInt() == 1);

        endGame();
    }

    private void playGame() {
        computer.generateRandomNumber();

        while (true) {
            System.out.println("세자리 숫자를 입력해주세요");
            List<Integer> playerInput = player.makeList(scanner.next());
            GameResult result = computer.compare(playerInput);
            System.out.println(result.getResultString());

            if (result.isGameOver()) {
                System.out.println("게임 종료");
                break;
            }
        }
    }

    private void endGame() {
        System.out.println("게임을 종료합니다. 감사합니다.");
        scanner.close();
    }
}

