package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("비어있는 경우 0을 반환한다.")
    void calculateEmpty() {
        String input = "";

        Calculator calculator = new Calculator();

        assertThat(calculator.calculate(input)).isEqualTo(0);
    }

    @Test
    @DisplayName("단일 값의 경우 그대로 반환한다.")
    void calculateSingle() {
        String input = "1";

        Calculator calculator = new Calculator();

        assertThat(calculator.calculate(input)).isEqualTo(1);
    }

    @Test
    @DisplayName("콤마를 구분자로 들어온 경우, 각각 숫자로 나누뒨 숫자들의 총합을 계산한다.")
    void calculateMultipleWithComma() {
        String input = "1,2,3";

        Calculator calculator = new Calculator();

        assertThat(calculator.calculate(input)).isEqualTo(6);
    }

    @Test
    @DisplayName("콜론을 구분자로 들어온 경우, 각각 숫자로 나누뒨 숫자들의 총합을 계산한다.")
    void calculateMultipleWithColon() {
        String input = "1:2:3";

        Calculator calculator = new Calculator();

        assertThat(calculator.calculate(input)).isEqualTo(6);
    }

    @Test
    @DisplayName("쉼표와 콜론을 혼합하여 사용한 경우, 숫자들의 합을 계산한다.")
    void calculateMultipleWithCommaAndColon() {
        String input = "1,2:3";

        Calculator calculator = new Calculator();

        assertThat(calculator.calculate(input)).isEqualTo(6);
    }

    @Test
    @DisplayName("커스텀 구분자로 구분된 숫자들의 합을 계산한다.")
    void calculateWithCustomDelimiter() {
        String input = "//;\\n1;2;3";

        Calculator calculator = new Calculator();

        assertThat(calculator.calculate(input)).isEqualTo(6);
    }
}
