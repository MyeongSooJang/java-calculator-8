package calculator;

import calculator.domain.Calculator;
import calculator.domain.InputString;
import calculator.domain.Numbers;
import calculator.domain.Tokens;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        String input = inputView.readInput();
        InputString inputString = new InputString(input);
        Tokens tokens = new Tokens(inputString.getValue());
        Numbers numbers = new Numbers(tokens.getValues());
        Calculator calculator = new Calculator(numbers);
        new OutputView().printResult(calculator.calculate());
    }
}
