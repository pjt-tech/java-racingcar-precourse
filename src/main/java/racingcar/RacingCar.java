package racingcar;

import nextstep.utils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private static final String GAME_RESULT = "\n실행 결과";
    private final ArrayList<Car> winners = new ArrayList<>();
    private static final int REFERENCE_NUMBER = 4;
    private static final int POSITION_PLUS_COUNT = 1;
    private static final int MIN_RANDOM_NUMBER = 0;
    private static final int MAX_RANDOM_NUMBER = 9;
    private final int runCount;
    private int tmpPosition;

    public RacingCar(int runCount) {
        this.runCount = runCount;
    }

    public void racingStart(List<Car> cars) {
        System.out.println(GAME_RESULT);
        for(int i = 0; i < runCount; i++) {
            setRacingCar(cars);
        }
        racingResult(cars);
    }

    private void racingResult(List<Car> cars) {
        for (Car car : cars) {
            setMatchWinner(car);
        }
    }

    private void setMatchWinner(Car car) {
        if(tmpPosition < car.getPosition()) {
            tmpPosition = car.getPosition();
            winners.clear();
            winners.add(car);
        } else if(tmpPosition == car.getPosition()){
            winners.add(car);
        }
    }

    private void setRacingCar(List<Car> cars) {
        for (Car car : cars) {
            setCarPosition(car, stopAndGo(getRandomNumber()));
        }
        printProgress(cars);
    }

    private void printProgress(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getCarName() + " : " + setRoute(car.getPosition()));
        }
        System.out.println();
    }

    private String setRoute(int position) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < position; i++) {
            builder.append("-");
        }
        return builder.toString();
    }

    public CarStatus stopAndGo(int randomNo) {
        return CarStatus.isState(randomNo, REFERENCE_NUMBER);
    }

    private void setCarPosition(Car car, CarStatus state) {
        if(CarStatus.MOVING_FORWARD == state) {
            car.setPosition(car.getPosition() + POSITION_PLUS_COUNT);
        }
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(MIN_RANDOM_NUMBER,MAX_RANDOM_NUMBER);
    }

    public void printResult() {
        String[] winner = new String[winners.size()];
        for (int i = 0; i < winners.size(); i++) {
            winner[i] = winners.get(i).getCarName();
        }
        System.out.println("최종 우승자는 " + String.join(",", winner) + " 입니다.");
    }
}
