package racingcar;

public enum CarStatus {
    STOP, GO;

    public static CarStatus isState(int no) {
        if(no >= 4) {
            return GO;
        }
        return STOP;
    }
}
