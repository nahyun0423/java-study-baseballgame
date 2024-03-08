package baseball;

import java.util.List;

public class GameRound {
    private BallsMaker ballsMaker;
    private GameView gameView;
    private Random random;
    private Judge judge;
    private boolean isPlay = true;

    public GameRound(BallsMaker ballsMaker, GameView gameView, Random random) {
        this.ballsMaker = ballsMaker;
        this.gameView = gameView;
        this.random = random;
    }

    public void playGame() {
        while (isPlay) {
            playRound();
        }
        gameView.endView();
    }

    private void playRound() {
        gameView.playView();
        String playerInput = new InputData().getPlayerInput();

        if (new Validation(ballsMaker).isValidInput(playerInput)) {
            processValidInput(playerInput);
        }
        if (!new Validation(ballsMaker).isValidInput(playerInput)) {
            gameView.invalidInputView();
        }
    }

    private void processValidInput(String playerInput) {
        List<Integer> playerNumbers = ballsMaker.splitStr(playerInput);
        List<Ball> playerBalls = ballsMaker.integerToBall(playerNumbers);

        Judge result = new Judge(0, 0);
        result.countResult(playerBalls, ballsMaker.integerToBall(random.generateRandom()));
        gameView.judgeView(result.getCountStrike(), result.getCountBall());

        if (result.getCountStrike() == Random.SIZE) {
            endGame(true);
            isPlay = false;
        }
        if (result.getCountStrike() != Random.SIZE) {
            judge.resetCounts();
        }
    }

    private void endGame(boolean isPlayerWinner) {
        gameView.endOrRestartView(isPlayerWinner);
        int endOrRestart = new InputData().getPlayerInputInt();

        if (endOrRestart == 1) {
            isPlay = false;
        }
        if (endOrRestart == 2) {
            new GameStarter(gameView, random).startGame();
        }
        if (endOrRestart != 1 && endOrRestart != 2) {
            gameView.invalidInputView();
            endGame(isPlayerWinner);
        }
    }
}
