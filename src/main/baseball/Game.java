package baseball;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Input input = new Input();
    RandomBall random = new RandomBall();
    Result result = new Result(0, 0);

    List<Integer> player = new ArrayList<>();
    List<Integer> com = new ArrayList<>();

    public void playGame() {
        while (isGameOver() != false) {
            player = input.inputBall();
            com = random.generateRandomBall();
            System.out.println(result.compare(player, com));

        }
    }

    public void closeGame() {

    }

    public boolean isGameOver() {
        if (result.compare(player, com).equals("3스트라이크")) {

        }
        return true;
    }
}
