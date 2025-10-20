package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TokensTest {
    @Test
    @DisplayName("빈 문자열이 들어오면 빈 리스트를 반환한다.")
    void emptyStringInput() {
        String input = "";

        Tokens tokens = new Tokens(input);

        assertThat(tokens.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("구분자가 없는 문자열이 들어오면 그대로 반환한다")
    void singleNumberInput() {
        String input = "1";

        Tokens tokens = new Tokens(input);

        assertThat(tokens.getValues()).containsExactly("1");
    }

    @Test
    @DisplayName("콜론을 구분자로 문자열을 분리한다.")
    void makeTokensByColon() {
        String input = "1:2:3";

        Tokens tokens = new Tokens(input);

        assertThat(tokens.getValues()).containsExactly("1", "2", "3");
    }

    @Test
    @DisplayName("쉼표를 구분자로 문자열을 분리한다.")
    void makeTokensByComma() {
        String input = "1,2";

        Tokens tokens = new Tokens(input);

        assertThat(tokens.getValues()).containsExactly("1", "2");
    }

    @Test
    @DisplayName("쉼표와 콜론을 구분자로 문자열을 분리한다.")
    void makeTokensByCommaAndColon() {
        String input = "1,2:3";

        Tokens tokens = new Tokens(input);

        assertThat(tokens.getValues()).containsExactly("1", "2", "3");
    }

    @Test
    @DisplayName("커스텀 구분자로 문자열을 분리한다.")
    void makeTokensByCustomDelimiter() {
        String input = "//;\\n1;2;3";

        Tokens tokens = new Tokens(input);

        assertThat(tokens.getValues()).containsExactly("1", "2", "3");
    }

}
