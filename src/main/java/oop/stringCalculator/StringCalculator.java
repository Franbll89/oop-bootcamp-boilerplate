package oop.stringCalculator;

import java.util.Arrays;

public class StringCalculator {

    public int add(String operands) {
        if (baseCase(operands)) return 0;
        return calculateTotal(operands);
    }

    private static boolean baseCase(String operands) {
        return operands.isEmpty();
    }

    private static int calculateTotal(String operands) {
        String[] operandsList = operands.split(",");
        return Arrays.stream(operandsList).mapToInt(num -> Integer.parseInt(num)).sum();
    }
}
