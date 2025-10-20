package calculator.domain;

public class Calculator {

    public int calculate(String input) {
        InputString inputString = new InputString(input);
        Tokens tokens = new Tokens(inputString.getValue());
        Numbers numbers = new Numbers(tokens.getValues());
        return numbers.sum();
    }
}

