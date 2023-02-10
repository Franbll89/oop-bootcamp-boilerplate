package oop.stringCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @BeforeEach
    void setup(){
        stringCalculator = new StringCalculator();
    }

    @ParameterizedTest
    @CsvSource({"'',0"})
    void itShouldReturn0(String inputs, Integer expected) {
        assertEquals(expected, stringCalculator.add(inputs));
        
    }

    @ParameterizedTest
    @CsvSource({"2,2"})
    void itShouldReturnSingleNumber(String inputs, Integer expected) {
        assertEquals(expected, stringCalculator.add(inputs));

    }

    @ParameterizedTest
    @CsvSource({"'1,2',3"})
    void itShouldReturnSumOfTwoNumbers(String inputs, Integer expected) {
        assertEquals(expected, stringCalculator.add(inputs));
    }

}