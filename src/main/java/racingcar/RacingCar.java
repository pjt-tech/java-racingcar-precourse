package racingcar;

public class RacingCar {
    public  RacingCar() {

    }
    public CarStatus stopAndGo(int no) {
        return CarStatus.isState(no);
    }
}
