package baseball;

public class Ball {
    int position;
    int ballNo;

    Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;
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
}