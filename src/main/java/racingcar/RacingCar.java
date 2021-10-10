package racingcar;

import nextstep.utils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RacingCar {

    private int tmpPosition;
    private final int runCount;
    private ArrayList<Car> champion = new ArrayList<>();

    public RacingCar(int runCount) {
        this.runCount = runCount;
    }

    public void racingStart(List<Car> cars) {
        for(int i = 0; i < runCount; i++) {
            setRacingCar(cars);
        }
        racingResult(cars);
    }

    private void racingResult(List<Car> cars) {
        for (Car car : cars) {
            setMatchWinner(car);
        }
        printResult();
    }

    private void printResult() {
        String[] winner = new String[champion.size()];
        for (int i = 0; i < champion.size(); i++) {
            winner[i] = champion.get(i).getCarName();
        }
        System.out.println("최종 우승자는 " + String.join(",", winner) + "입니다. 축하합니다~!!!");
    }

    private void setMatchWinner(Car car) {
        if(tmpPosition <= car.getPosition()) {
            tmpPosition = car.getPosition();
            champion.add(car);
        }
    }

    private void setRacingCar(List<Car> cars) {
        for (Car car : cars) {
            setCarPosition(car, stopAndGo(getRandomNumber()));
        }
    }

    public CarStatus stopAndGo(int no) {
        return CarStatus.isState(no);
    }

    private void setCarPosition(Car car, CarStatus state) {
        if(CarStatus.GO == state) {
            int position = car.getPosition();
            car.setPosition(position += 1);
        }
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }
}
