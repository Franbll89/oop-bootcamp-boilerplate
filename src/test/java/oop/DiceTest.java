package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void itShouldCalculateProbabilityToGetASix() {
        Dice dice = new Dice();

        double result = dice.calculateProbabilityToGetASix();

        assertEquals(result, 1.0/6);
    }
}