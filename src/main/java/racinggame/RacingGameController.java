package racinggame;

import nextstep.utils.Console;
import racingcar.Car;
import racingcar.Cars;
import racingcar.RacingCar;
import utils.ValidationUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class RacingGameController {

    private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요!!(이름은 쉼표(,)기준으로 구분됩니다.)";
    private static final String ERROR_CAR_NAME = "[ERROR]자동차 이름은 5글자 이하만 가능합니다.^^*";
    private static final String INPUT_RACING_COUNT = "시도할 회수는 몇회인가요?";
    private static final String ERROR_RACING_COUNT = "[ERROR]숫자만 입력가능합니다.^^*";
    private RacingCar car;
    private Cars cars;
    private int runCount;
    private boolean lengthVerificationLoop = true;
    private boolean NumberVerificationLoop = true;

    public boolean getUserInput() {
        while (lengthVerificationLoop) {
            System.out.println(INPUT_CAR_NAME);
            checkInputValue();
        }
        return true;
    }

    private void checkInputValue() {
        try {
            String[] carNames = Console.readLine().split(",");
            cars = new Cars(createCars(carNames));
            lengthVerificationLoop = false;
            inputRacingCount();
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_CAR_NAME);
        }
    }

    private void inputRacingCount() {
        while (NumberVerificationLoop) {
            System.out.println(INPUT_RACING_COUNT);
            validationNumber();
        }
    }

    private void validationNumber() {
        String inputNumber = Console.readLine();
        if(!ValidationUtils.verificationNumber(inputNumber)){
            System.out.println(ERROR_RACING_COUNT);
            return;
        }
        runCount = Integer.parseInt(inputNumber);
        NumberVerificationLoop = false;
    }

    public void startGame() {
        car = new RacingCar(runCount);
        car.racingStart(cars.getCars());
    }

    private ArrayList<Car> createCars(String[] carNames) {
        ArrayList<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(new Car(carName,0));
        }
        return carList;
    }

    public void setView() {
        car.printResult();
    }
}
