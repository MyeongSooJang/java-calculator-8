package calculator.domain;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("비어있는 경우 0을 반환한다.")
    void calculateEmpty() {
        Numbers numbers = new Numbers(List.of());

        Calculator calculator = new Calculator(numbers);

        assertThat(calculator.calculate()).isEqualTo(0);
    }

    @Test
    @DisplayName("단일 값의 경우 그대로 반환한다.")
    void calculateSingle() {
        Numbers numbers = new Numbers(List.of("1"));

        Calculator calculator = new Calculator(numbers);

        assertThat(calculator.calculate()).isEqualTo(1);
    }

    @Test
    @DisplayName("여러 값을 가지는 경우 모든 수를 더한 값을 반환한다.")
    void calculateMultiple() {
        Numbers numbers = new Numbers(List.of("1", "2", "3"));

        Calculator calculator = new Calculator(numbers);

        assertThat(calculator.calculate()).isEqualTo(6);
    }
}
