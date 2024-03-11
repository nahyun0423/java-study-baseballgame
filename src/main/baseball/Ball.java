package baseball;

import java.util.Objects;

public class Ball {
    public static final int MIN_NO = 1;
    public static final int MAX_NO = 9;
    private int position;
    private int ballNo;

    Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;
    }

    public boolean validNo(int no) {
        if (no >= MIN_NO && no <= MAX_NO) {
            return true;
        }
        throw new IllegalArgumentException("유효하지 않은 입력입니다. 다시 입력해주세요.");
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