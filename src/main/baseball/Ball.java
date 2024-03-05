package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Ball {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;
    private int position;
    private int ballNo;

    Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;
    }

    public static boolean validNo(int no) {
        return no >= MIN_NO && no <= MAX_NO;
    }

    public static boolean hasDuplicate(List<Integer> list) {
        Set<Integer> item = new HashSet<>(list);
        return item.size() != list.size();
    }

    public int getBallNo() {
        return ballNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ball other = (Ball) obj;
        return this.position == other.position && this.ballNo == other.ballNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, ballNo);
    }
}