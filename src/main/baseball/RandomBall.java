package baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomBall {
    public static final int SIZE = 3;
    private Set<Integer> randomSet = new HashSet<>();

    public List<Integer> generateRandomBall() {
        while (randomSet.size() < SIZE) {
            randomSet.add((int) (Math.random() * SIZE) + 1);
        }
        ArrayList<Integer> randomBall = new ArrayList<>(randomSet);
        return randomBall;
    }
}