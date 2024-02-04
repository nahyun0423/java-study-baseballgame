package main;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public List<Integer> makeList(String input) {
        List<Integer> list = new ArrayList<>();
        for (char i : input.toCharArray()) {
            list.add(Character.getNumericValue(i));
        }
        return list;
    }
}
