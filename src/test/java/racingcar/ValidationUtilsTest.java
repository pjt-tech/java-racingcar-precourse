package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ValidationUtils;

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

    @Test
    @DisplayName("자동자 이름이 5글자 이하인지 검증")
    void 자동차_이름_5글자_이하() {
        assertThat(ValidationUtils.validLengthName(Arrays.asList("crong","luppy","ace"))).isTrue();
        assertThat(ValidationUtils.validLengthName(Arrays.asList("crong","luppy","aceace"))).isFalse();
    }

    @Test
    @DisplayName("입력값이 숫자인가?")
    void 숫자_검증() {
        assertThat(ValidationUtils.verificationNumber("5")).isTrue();
        assertThat(ValidationUtils.verificationNumber("as")).isFalse();
    }
}
