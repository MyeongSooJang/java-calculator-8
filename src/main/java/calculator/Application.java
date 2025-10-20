package calculator;

import calculator.domain.Calculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        String input = inputView.readInput();

        Calculator calculator = new Calculator();
        int calculateResult = calculator.calculate(input);

        new OutputView().printResult(calculateResult);
    }
}
