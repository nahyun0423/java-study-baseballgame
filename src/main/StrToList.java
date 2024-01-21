package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrToList {

    public List<Integer> changeToList() {
        List<Integer> playerNum = new ArrayList<>();
        String input = Input.inputNum();
        String[] splitedStr = input.split("");

        for (String s : splitedStr) {
            playerNum.add(Integer.parseInt(s));
        }
        return playerNum;
    }
}
