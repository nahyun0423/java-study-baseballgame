package baseball;

import java.util.List;
import java.util.Scanner;

public class Game {
    private BallsMaker ballsMaker = new BallsMaker();
    private Judge judge = new Judge();
    private Random random = new Random();
    private GameView gameView = new GameView();
    private List<Integer> computerNumbers;
    private boolean isPlay = true;

    public void startGame() {
        gameView.startView();
        computerNumbers = random.generateRandom();
        playGame();
    }

    private void playGame() {

        while (isPlay) {
            playRound();
        }
    }

    private void playRound() {
        gameView.playView();
        String playerInput = getPlayerInput();

        if (isValidInput(playerInput)) {
            processValidInput(playerInput);
        }
        if (!isValidInput(playerInput)) {
            gameView.invalidInputView();
        }
    }

    private void processValidInput(String playerInput) {
        List<Integer> playerNumbers = ballsMaker.splitStr(playerInput);
        List<Ball> playerBalls = ballsMaker.integerToBall(playerNumbers);

        Judge result = judge.result(playerBalls, ballsMaker.integerToBall(computerNumbers));
        gameView.judgeView(result.getCountStrike(), result.getCountBall());

        if (result.getCountStrike() == Random.SIZE) {
            endGame(true);
            isPlay = false;
        }
        if (result.getCountStrike() != Random.SIZE) {
            judge.resetCounts();
        }
    }

    private String getPlayerInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private boolean isValidInput(String input) {
        if (input.length() != Random.SIZE) {
            return false;
        }

        List<Integer> playerNumbers = ballsMaker.splitStr(input);

        return playerNumbers.stream().allMatch(Ball::validNo) && !Ball.hasDuplicate(playerNumbers);
    }

    private void endGame(boolean isPlayerWinner) {
        gameView.endOrRestartView(isPlayerWinner);
        int endOrRestart = getPlayerInputInt();

        if (endOrRestart == 1) {
            gameView.endView();
        }
        if (endOrRestart == 2) {
            startGame();
        }
        if (endOrRestart != 1 && endOrRestart != 2) {
            gameView.invalidInputView();
            endGame(isPlayerWinner);
        }
    }

    private int getPlayerInputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}