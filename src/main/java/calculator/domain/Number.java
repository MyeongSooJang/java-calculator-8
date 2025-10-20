package calculator.domain;

public class Number {

    private final int number;

    public Number(int token) {
        this.number = validateNegative(token);
    }

    private int validateNegative(int token) {
        if (token < 0) {
            throw new IllegalArgumentException("음수는 입력할 수 없습니다");
        }
        return token;
    }

    public int getNumber() {
        return number;
    }

}
