package baseball;

import java.util.*;
import java.util.stream.Collectors;

public class Balls {
    private List<Ball> ballsList = new ArrayList<>();

    public void hasDuplicate(List<Integer> list) {
        Set<Integer> item = new HashSet<>(list);
        if (item.size() != list.size()) {
            throw new IllegalArgumentException("중복된 숫자가 있습니다");
        }
    }

    public List<Integer> splitStr(String input) {
        return Arrays.stream(input.split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public List<Ball> integerToBall(List<Integer> inputList) {
        hasDuplicate(inputList);
        return makeBallsList(
                new Ball(1, inputList.get(0)),
                new Ball(2, inputList.get(1)),
                new Ball(3, inputList.get(2))
        );
    }

    public List<Ball> makeBallsList(Ball ball1, Ball ball2, Ball ball3) {
        ballsList.clear();
        ballsList.add(ball1);
        ballsList.add(ball2);
        ballsList.add(ball3);
        return ballsList;
    }
}