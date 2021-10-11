package racingcar;

public enum CarStatus {
    STOP, GO;

    public static CarStatus isState(int randomNo, int referenceNo) {
        if(randomNo >= referenceNo) {
            return GO;
        }
        return STOP;
    }
}
