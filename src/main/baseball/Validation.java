package baseball;

public class Validation {
    private Balls balls;
    private Ball ball = new Ball(0,0);

    public Validation(Balls balls) {
        this.balls = balls;
    }

    public void validateInput(String input) {
        if (input.length() != Random.SIZE) {
            throw new IllegalArgumentException("입력은 " + Random.SIZE + "자리여야 합니다.");
        }
    }

    public void validateInputEnd(int input) {
        if (input != 1 && input != 2) {
            throw new IllegalArgumentException("유효하지 않은 입력입니다. 1과 2만 입력해주세요.");
        }
    }
}