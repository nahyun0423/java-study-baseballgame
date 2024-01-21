package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateRandom {
    Random random = new Random();
    List<Integer> randomNum = new ArrayList<>();

    public List<Integer> createRandomNum() {
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(9) + 1;
            randomNum.add(number);
        }
        return randomNum;
    }
}
