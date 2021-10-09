package racingcar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    private RacingCar car;

    @BeforeEach
    void setup() {
        car = new RacingCar();
    }

    @Test
    @DisplayName("랜덤 값이 4이상일경우 전진!")
    void go() {
        Assertions.assertThat(car.startRace(4)).isTrue();
    }

    @Test
    @DisplayName("랜덤 값이 3이상일경우 멈춰!")
    void stop() {
        Assertions.assertThat(car.startRace(3)).isFalse();
    }
}
