package calculator.domain;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumbersTest {
    @Test
    @DisplayName("나누어진 토큰들을 숫자로 변환")
    void parseNumbers() {
        List<String> input = List.of("1", "2", "3");

        Numbers numbers = new Numbers(input);

        assertThat(numbers.getValues()).containsExactly(1, 2, 3);
    }

}
