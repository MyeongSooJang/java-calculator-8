package calculator.domain;

import java.util.List;

public class Tokens {

    private final List<String> values;

    public Tokens(String input) {
        this.values = split(input);
    }

    private List<String> split(String input) {
        if (input.isEmpty()) {
            return List.of();
        }
        String[] tokens = input.split("[,:]");
        return List.of(tokens);
    }

    public List<String> getValues() {
        return values;
    }


}
