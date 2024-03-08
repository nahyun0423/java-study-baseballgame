package baseball;

public class GameStarter {
    private GameView gameView;
    private Random random;

    public GameStarter(GameView gameView, Random random) {
        this.gameView = gameView;
        this.random = random;
    }

    public void startGame() {
        gameView.startView();
        new GameRound(new BallsMaker(), gameView, random).playGame();
    }
}
