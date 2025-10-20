package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_MESSAGE = "문자열을 입력해주세요";

    public String readInput() {
        System.out.println(INPUT_MESSAGE);
        return Console.readLine();
    }
}
