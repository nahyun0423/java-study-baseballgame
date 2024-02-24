package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ValidationUtils {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;


    public static boolean validNo(int no) {
        return no >= MIN_NO && no <= MAX_NO;
    }

    public static boolean hasDuplicate(List<Integer> defaultBall) {
        Set<Integer> item = new HashSet<>(defaultBall);
        return item.size() != defaultBall.size();
    }

    public static boolean hasDuplicate2(List<Integer> defaultBall) {
        List<Integer> items = defaultBall
                .stream()
                .distinct()
                .collect(Collectors.toList());
        return items.size() != defaultBall.size();
    }
}
