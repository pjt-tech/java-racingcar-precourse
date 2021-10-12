package racingcar;

import java.util.ArrayList;

public class Winners {
    private final ArrayList<Car> winners;

    public Winners(ArrayList<Car> winners) {
        this.winners = winners;
    }

    public ArrayList<Car> getWinners() {
        return winners;
    }

    public void printResult() {
        String[] winner = new String[winners.size()];
        for (int i = 0; i < winners.size(); i++) {
            winner[i] = winners.get(i).getCarName();
        }
        System.out.println("최종 우승자는 " + String.join(",", winner) + " 입니다.");
    }
}
