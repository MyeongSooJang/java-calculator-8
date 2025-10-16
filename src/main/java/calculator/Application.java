package calculator;

import calculator.domain.InputString;
import calculator.view.InputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        String input = inputView.readInput();
        InputString inputString = new InputString(input);
    }
}
