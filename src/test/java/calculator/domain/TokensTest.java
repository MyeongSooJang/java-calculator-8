package calculator.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TokensTest {
    @Test
    @DisplayName("빈 문자열이 들어오면 빈 리스트를 반환한다.")
    void emptyStringReturnsEmptyList() {
        String input = "";

        Tokens tokens = new Tokens(input);

        assertThat(tokens.isEmpty()).isTrue();
    }

}
