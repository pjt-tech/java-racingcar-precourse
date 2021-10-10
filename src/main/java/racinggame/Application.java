package racinggame;

import racingcar.Car;
import racingcar.RacingCar;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        RacingCar car = new RacingCar(5);
        car.racingStart(Arrays.asList(new Car("m3",0),new Car("g70",0),new Car("stinger",0)));
        car.printResult();
    }
}
