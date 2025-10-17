package calculator.domain;

public class Calculator {

    private final Numbers numbers;

    public Calculator(Numbers numbers) {
        this.numbers = numbers;
    }

    public int calculate() {
        int sum = 0;
        for (int number : numbers.getValues()) {
            sum += number;
        }
        return sum;
    }
}
