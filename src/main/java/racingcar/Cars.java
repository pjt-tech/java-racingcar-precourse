package racingcar;

import utils.ValidationUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class Cars {
    private final ArrayList<Car> cars;

    public Cars(ArrayList<Car> cars) {
        checkValidation(cars);
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    private void checkValidation(ArrayList<Car> cars) {
        if (!ValidationUtils.validLengthName(Arrays.asList(getCarNames(cars)))) {
            throw new IllegalArgumentException();
        }
    }

    private String[] getCarNames(ArrayList<Car> cars) {
        String[] carNames = new String[cars.size()];
        for(int i = 0; i < cars.size(); i++) {
            carNames[i] = cars.get(i).getCarName();
        }
        return carNames;
    }
}
