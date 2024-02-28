package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    Input input = new Input();
    RandomBall random = new RandomBall();
    Result result = new Result(0, 0);

    List<Integer> player = new ArrayList<>();
    List<Integer> com = new ArrayList<>();

    public void playGame() {
        System.out.println("게임을 시작하지");
        com = random.generateRandomBall();

        while (!isGameOver(result.compare(player, com))) {
            System.out.print("세자리 수 입력 : ");
            int inputData = scanner.nextInt();
            player = input.inputBall(inputData);

            System.out.println(result.compare(player, com));
        }
    }

    public void closeGame() {
        System.out.println("게임을 종료하려면 1, 재시작하려면 2를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();

        if (data == 2) {
            playGame();
        }
    }

    public boolean isGameOver(String resultStr) {
        if (result.compare(player, com).equals("3스트라이크 ")) {
            return true;
        }
        return false;
    }
}
