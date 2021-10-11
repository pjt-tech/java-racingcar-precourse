package racingcar;

public enum CarStatus {
    STOP, MOVING_FORWARD;

    public static CarStatus isState(int randomNo, int referenceNo) {
        if(randomNo >= referenceNo) {
            return MOVING_FORWARD;
        }
        return STOP;
    }
}
