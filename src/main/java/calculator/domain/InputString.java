package calculator.domain;

public class InputString {

    private final String value;

    public InputString(String value) {
        this.value = validateNull(value);
    }

    public String getValue() {
        return value;
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    private String validateNull(String value) {
        if (value == null) {
            return "";
        }
        return value;
    }
}
