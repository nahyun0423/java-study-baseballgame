package baseball;

import java.util.List;

public class GameRound {
    private Balls playerBalls = new Balls();
    private Balls comBalls = new Balls();
    private GameView gameView;
    private Random random;
    private Judge judge = new Judge(0, 0);
    private boolean isPlay = true;

    public GameRound(GameView gameView, Random random) {
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

        try {
            new Validation(playerBalls).validateInput(playerInput);
            processValidInput(playerInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void processValidInput(String playerInput) {
        List<Integer> playerNumbers = playerBalls.splitStr(playerInput);
        List<Ball> playerList = playerBalls.integerToBall(playerNumbers); //integerToball이 문제

        Judge result = new Judge(0, 0);
        result.countResult(playerList, comBalls.integerToBall(random.generateRandom())); //여기서 랜덤=입력값 됨
        gameView.judgeView(result.getCountStrike(), result.getCountBall());

        if (result.getCountStrike() == Random.SIZE) {
            gameView.successView();
            endGame();
            isPlay = false;
        }
        if (result.getCountStrike() != Random.SIZE) {
            judge.resetCounts();
        }
    }

    private void endGame() {
        Balls balls = new Balls();
        gameView.endOrRestartView();

        int endOrRestart = new InputData().getPlayerInputInt();

        try {
            new Validation(balls).validateInputEnd(endOrRestart);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        if (endOrRestart == 1) {
            isPlay = false;
        }
        if (endOrRestart == 2) {
            new GameStarter(gameView, random).startGame();
        }
        if (endOrRestart != 1 && endOrRestart != 2) {
            endGame();
        }
    }
}