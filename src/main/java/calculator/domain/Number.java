package calculator.domain;

public class Number {

    private final int NUMBER;

    public Number(int token) {
        this.NUMBER = validateNegative(token);
    }

    private int validateNegative(int token) {
        if (token < 0) {
            throw new IllegalArgumentException("음수는 입력이 불가능합니다.");
        }
        return token;
    }

    public int getNumber() {
        return NUMBER;
    }

}
