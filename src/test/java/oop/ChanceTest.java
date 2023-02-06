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

        double result = chance.calculateChanceToGetASixFromADice();
        assertEquals(result, 1.0 / 6);
    }

    @Test
    void itShouldCalculateChanceToNotGetASix() {

        double result = chance.calculateChanceToNotGetASixFromADice();
        double expected = 1 - 1.0 / 6;
        assertEquals(result, expected);
    }
}