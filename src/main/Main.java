package main;

public class Main {
    static Compare compare = new Compare();
    static Result result = new Result();
    static PlayGame playGame = new PlayGame();
    static StrToList strToList = new StrToList();
    static CreateRandom createRandom = new CreateRandom();

    public static void main(String[] args) {
        boolean play = true;

        while (play) {
            System.out.println("세자리 숫자를 입력해주세요");
            compare.countScore(createRandom.createRandomNum(), strToList.changeToList());
            System.out.println(result.judgeResult());
            if (result.judgeResult().equals("3스트라이크")) {
                System.out.println("성공! 게임 다시 시작 : 1, 종료 : 2");
                play = playGame.playAgain();
            }
        }
    }
}