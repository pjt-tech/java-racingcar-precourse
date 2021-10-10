package racingcar;

public class Car {
    private String carName;
    private int racingCount;

    public Car(String carName, int racingCount) {
        this.carName = carName;
        this.racingCount = racingCount;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getRacingCount() {
        return racingCount;
    }

    public void setRacingCount(int randomNo) {
        this.racingCount = randomNo;
    }
}
