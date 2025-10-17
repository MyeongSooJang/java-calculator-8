package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {

    @Test
    @DisplayName("나누어진 토큰을 숫자로 변환")
    void parseSingleNumber() {
        List<String> input = List.of("1");

        Numbers numbers = new Numbers(input);

        assertThat(numbers.getValues()).containsExactly(1);
    }

    @Test
    @DisplayName("나누어진 토큰들을 숫자로 변환")
    void parseMultipleNumbers() {
        List<String> input = List.of("1", "2", "3");

        Numbers numbers = new Numbers(input);

        assertThat(numbers.getValues()).containsExactly(1, 2, 3);
    }

    @Test
    @DisplayName("숫자가 아닌 값인 경우, 예외 발생")
    void throwExceptionWhenInvalidNumbers() {
        List<String> input = List.of("1", "2", "ㄴ");

        assertThatThrownBy(() -> new Numbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자가 아닌 값이 포함되어 있습니다 : " + "ㄴ");
    }

    @Test
    @DisplayName("숫자가 음수인 경우, 예외 발생")
    void throwExceptionWhenNegativeNumbers() {
        List<String> input = List.of("1", "2", "-2");

        assertThatThrownBy(() -> new Numbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("음수는 입력이 불가능합니다.");
    }
}
