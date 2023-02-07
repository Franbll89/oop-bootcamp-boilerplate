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
        Chance chance = new Chance(0.1);
        Chance result = chance.calculateOddsOfTwoChances(new Chance(0.1));
        double expected = Math.pow(0.1, 2);

        assertEquals(result.getValue(), expected);
    }
}