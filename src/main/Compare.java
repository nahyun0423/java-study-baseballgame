package main;

import java.util.List;

public class Compare {
    private int count = 0;
    private int strike = 0;
    private int ball = 0;


    public void countScore(List<Integer> random, List<Integer> input) {
        for (int i = 0; i < 3; i++) {
            countEquals(random, input, i);
            countStrike(random, input, i);
        }

        ball = count - strike;
    }

    public void countEquals(List<Integer> random, List<Integer> input, int i) {
        if (random.contains(input.get(i))) {
            count += 1;
        }
    }

    public void countStrike(List<Integer> random, List<Integer> input, int i) {
        if (random.get(i) == input.get(i)) {
            strike += 1;
        }
    }
}
