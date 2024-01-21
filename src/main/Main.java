package main;

public class Main {
    static Compare compare = new Compare();
    static StrToList strToList = new StrToList();
   static CreateRandom createRandom = new CreateRandom();

    public static void main(String[] args) {
        boolean play = true;

        while (play) {
            compare.countScore(createRandom.createRandomNum(), strToList.changeToList());

        }

        if (result.judgeResult().equals("3스트라이크")) {
            finishiGame()
        }
    }
}