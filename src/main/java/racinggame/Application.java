package racinggame;

import racingcar.Car;
import racingcar.RacingCar;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // TODO 자동차 경주 게임 구현
        RacingCar car = new RacingCar(5);
        car.racingStart(Arrays.asList(new Car("g70",0),new Car("m3",0)));
    }
}
