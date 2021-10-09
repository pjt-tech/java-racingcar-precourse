package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {

    @Test
    @DisplayName("입력받은 랜덤숫자 0~9사이인지 검증")
    void 랜덤_숫자_0_9_사이() {
        assertThat(ValidationUtils.validNo(9)).isTrue();
        assertThat(ValidationUtils.validNo(0)).isTrue();
        assertThat(ValidationUtils.validNo(10)).isFalse();
        assertThat(ValidationUtils.validNo(-1)).isFalse();
    }
}
