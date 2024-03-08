package baseball;

public class Main {
    public static void main(String[] args) {
        GameStarter gameStarter = new GameStarter(new GameView(), new Random());
        gameStarter.startGame();
    }
}
