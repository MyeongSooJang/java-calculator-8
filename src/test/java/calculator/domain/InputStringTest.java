package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputStringTest {

    @Test
    @DisplayName("빈 문자열을 입력하면 빈 문자열을 반환한다.")
    void emptyStringReturnsEmptyString() {
        String input = "";

        InputString inputString = new InputString(input);

        assertThat(inputString.getValue()).isEmpty();
    }

    @Test
    @DisplayName("null을 입력하면 빈 문자열을 반환한다.")
    void NullReturnsEmptyString() {
        String input = null;

        InputString inputString = new InputString(input);

        assertThat(inputString.getValue()).isEmpty();
    }

    @Test
    @DisplayName("일반 문자열을 입력하면 그대로 반환한다.")
    void normalStringReturnsAsIs() {
        String input = "1,2,3";

        InputString inputString = new InputString(input);

        assertThat(inputString.getValue()).isEqualTo("1,2,3");
    }

    @Test
    @DisplayName("커스텀 구분자 문자열을 입력하면 그대로 반환한다.")
    void customDelimiterStringReturnsAsIs() {
        String input = "//;\n1;2;3";

        InputString inputString = new InputString(input);

        assertThat(inputString.getValue()).isEqualTo("//;\n1;2;3");
    }
}
