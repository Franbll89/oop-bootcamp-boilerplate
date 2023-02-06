package oop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceTest {

    Chance chance;

    @BeforeEach
    public void setup() {
        chance = new Chance();
    }

    @Test
    void itShouldCalculateChanceToGetASix() {

        double result = chance.calculateOddsToGetASix();
        assertEquals(result, 1.0 / 6);
    }

    @Test
    void itShouldCalculateChanceToNotGetASix() {

        double result = chance.calculateOddsToNotGetASix();
        double expected = 1 - 1.0 / 6;
        assertEquals(result, expected);
    }

    @Test
    void itShouldCalculateOddsOfTwoChances() {

        double result = chance.calculateOddsOfTwoChances();
        double expected = Math.pow((1.0 / 6), 2);

        assertEquals(result, expected);
    }
}