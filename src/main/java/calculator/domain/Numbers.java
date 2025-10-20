package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final List<Number> values;

    public Numbers(List<String> tokens) {
        this.values = convertToNumbers(tokens);
    }

    private List<Number> convertToNumbers(List<String> tokens) {
        List<Number> numbers = new ArrayList<>();
        for (String token : tokens) {
            Number number = parseNumber(token);
            numbers.add(number);
        }
        return numbers;
    }

    private Number parseNumber(String token) {
        try {
            return new Number(Integer.parseInt(token));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다 : " + token);
        }
    }

    public int sum() {
        int sum = 0;
        for (Number number : values) {
            sum += number.getNumber();
        }
        return sum;
    }

    public List<Number> getValues() {
        return this.values;
    }

}