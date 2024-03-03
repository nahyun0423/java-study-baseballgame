package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;

    public boolean validNo(int no) {
        return no >= MIN_NO && no <= MAX_NO;
    }

    public boolean hasDuplicate(List<Integer> list) {
        Set<Integer> item = new HashSet<>(list);
        return item.size() != list.size();
    }
}
