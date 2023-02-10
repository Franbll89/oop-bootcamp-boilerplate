package oop.stringCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator stringCalculator;

    @BeforeEach
    void setup(){
        stringCalculator = new StringCalculator();
    }
    
    @Test
    void itShouldReturn0() {
        assertEquals(0, stringCalculator.add(""));
        
    }

    @Test
    void itShouldReturnSingleNumber() {
        assertEquals(2, stringCalculator.add("2"));

    }

    @Test
    void itShouldReturnSumOfTwoNumbers() {
        assertEquals(3, stringCalculator.add("1,2"));

    }

}