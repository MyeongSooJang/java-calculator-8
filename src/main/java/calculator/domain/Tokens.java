package calculator.domain;

import java.util.List;

public class Tokens {

    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final int CUSTOM_DELIMITER_INDEX = 2;

    private final List<String> values;

    public Tokens(String input) {
        this.values = makeTokens(input);
    }

    private List<String> makeTokens(String input) {
        if (input.isEmpty()) {
            return List.of();
        }
        if (input.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            return splitByCustomDelimiter(input);
        }
        return splitByOriginalDelimiter(input);
    }

    private List<String> splitByOriginalDelimiter(String input) {
        String[] tokens = input.split("[,:]");
        return List.of(tokens);
    }

    private List<String> splitByCustomDelimiter(String input) {
        if (input.length() < 4) {
            throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
        }

        char delimiter = input.charAt(CUSTOM_DELIMITER_INDEX);
        int delimiterIndex = input.indexOf("\\n");

        if (delimiterIndex == -1) {
            throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
        }

        String numberPart = input.substring(delimiterIndex + 2);
        String[] tokens = numberPart.split(String.valueOf(delimiter));
        return List.of(tokens);
    }

    public List<String> getValues() {
        return values;
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

}
