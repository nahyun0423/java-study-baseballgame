package main;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<Integer> makeList(String input) {
        List<Integer> playerList = new ArrayList<>();
        for (char i : input.toCharArray()) {
            playerList.add(Character.getNumericValue(i));
        }
        return playerList;
    }
}
