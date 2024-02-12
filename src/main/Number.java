package main;

import java.util.Random;
import java.util.Scanner;

public class Number {
    private int[] randomNum = {0, 0, 0};
    private int[] playerNum = {0, 0, 0};
    Random random = new Random();
    private int i;

    public void createRandomNum() {
        for (this.i = 0; i < 3; i++) {
            int num = random.nextInt(9) + 1;
            inputValue(i, randomNum, num);
        }
    }

    public void inputPlayerNum() {
        for (this.i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            int inputNum = scanner.nextInt();
            inputValue(i, playerNum, inputNum);
        }
    }

    public void inputValue(int i, int[] arr, int inputNum) {
        if (!checkDuplicate(inputNum, arr)) {
            arr[i] = inputNum;
        }
        if (checkDuplicate(inputNum, arr)) {
            this.i--;
        }
    }

    public boolean checkDuplicate(int num, int[] arr) {
        for (this.i = 0; i < 3; i++) {
            return checkContains(i, arr, num);
        }
        return false;
    }

    public boolean checkContains(int i, int[] arr, int num) {
        if (arr[i] == num) {
            return true;
        }
        return false;
    }

    public int[] getRandomNum(){
        return randomNum;
    }

    public int[] getPlayerNum() {
        return playerNum;
    }
}