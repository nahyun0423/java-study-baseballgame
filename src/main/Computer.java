package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {
    private List<Integer> randomNumber;

    public Computer() {
        this.randomNumber = new ArrayList<>();
    }

    public void generateRandomNumber() {
        randomNumber.clear();
        Random random = new Random();

        while (randomNumber.size() < 3) {
            int num = random.nextInt(9) + 1;
            if (!randomNumber.contains(num)) {
                randomNumber.add(num);
            }
        }
    }

    public GameResult compare(List<Integer> playerNumber) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < playerNumber.size(); i++) {
            if (playerNumber.get(i).equals(randomNumber.get(i))) {
                strike++;
            } else if (randomNumber.contains(playerNumber.get(i))) {
                ball++;
            }
        }
        boolean gameOver = (strike == 3);

        return new GameResult(strike, ball, gameOver);
    }

    public List<Integer> getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(List<Integer> randomNumber) {
        this.randomNumber = randomNumber;
    }
}