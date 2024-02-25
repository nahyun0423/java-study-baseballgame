package baseball;

public class Game {
    Input input = new Input();
    RandomBall random = new RandomBall();
    Balls balls = new Balls();

    public void playGame(){
        balls.makeBalls(input.inputBall());
        balls.makeBalls(random.generateRandomBall());
    }
}
