package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {

    private RacingCar car;

    @BeforeEach
    void setup() {
        car = new RacingCar();
    }

    @Test
    @DisplayName("숫자가 4이상이면 RUN 4이하이면 STOP")
    void stop_and_go() {
        assertThat(car.stopAndGo(4)).isEqualTo(CarStatus.GO);
        assertThat(car.stopAndGo(3)).isEqualTo(CarStatus.STOP);
    }

    @Test
    @DisplayName("자동차 경주 준비!")
    void ready() {

    }

    @Test
    @DisplayName("자동차 경주 시작!")
    void start() {
    }
}