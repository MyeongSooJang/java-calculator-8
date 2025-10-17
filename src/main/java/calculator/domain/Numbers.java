package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final List<Integer> values;

    public Numbers(List<String> tokens) {
        this.values = convertToNumbers(tokens);
    }

    private List<Integer> convertToNumbers(List<String> tokens) {
        List<Integer> numbers = new ArrayList<>();
        for (String token : tokens) {
            int number = parseNumber(token);
            validateNegative(number);
            numbers.add(number);
        }
        return numbers;
    }

    private int parseNumber(String token) {
        try {
            return Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다 : " + token);
        }
    }

    private void validateNegative(int token) {
        if (token < 0) {
            throw new IllegalArgumentException("음수는 입력이 불가능합니다.");
        }
    }

}
