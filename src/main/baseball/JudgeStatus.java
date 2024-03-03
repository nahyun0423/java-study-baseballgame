package baseball;

public enum JudgeStatus {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱")
    ;

    private final String status;

    JudgeStatus(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }
}
