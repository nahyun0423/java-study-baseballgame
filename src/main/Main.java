package main;

public class Main {
    static Result result = new Result();
    static PlayGame playGame = new PlayGame();
    static StrToList strToList = new StrToList();
    static CreateRandom createRandom = new CreateRandom();

    public static void main(String[] args) {
        boolean play = true;

        while (play) {
            System.out.println("세자리 숫자를 입력해주세요");
            Compare compare = new Compare();

            compare.countScore(createRandom.createRandomNum(), strToList.changeToList());
            String reslutStr = result.judgeResult(compare.getBall(), compare.getStrike());
            System.out.println(reslutStr);
            if (reslutStr.equals("3스트라이크")) {
                System.out.println("성공! 게임 다시 시작 : 1, 종료 : 2");
                play = playGame.playAgain();
            }
        }
    }
}