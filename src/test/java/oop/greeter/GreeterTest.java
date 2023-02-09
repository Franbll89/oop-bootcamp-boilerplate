package oop.greeter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    private Greeter greeter;

    @BeforeEach
    void setup() {
        greeter = new Greeter();
    }
    @Test
    void itShouldGreetClaudia() {
        String actual = greeter.greet("Claudia");

        assertEquals("Hello Claudia", actual);
    }

    @Test
    void itShouldGreetFrancesco() {
        String actual = greeter.greet("Francesco");

        assertEquals("Hello Francesco", actual);
    }

    @Test
    void itShouldTrimTheInput() {
        String actual = greeter.greet(" Antonio ");

        assertEquals("Hello Antonio", actual);
    }

    @Test
    void itShouldCapitalizeTheFirstLetterOfTheName() {
        String actual = greeter.greet("belen");

        assertEquals("Hello Belen", actual);
    }

    @Test
    public void itShouldGreetTheMorningAt6() {
        greeter.setTime("06:00");
        String actual = greeter.greet("Melissa");
        assertEquals("Good morning Melissa", actual);
    }

    @Test
    public void itShouldGreetTheMorningAt7() {
        greeter.setTime("07:00");
        String actual = greeter.greet("Melissa");
        assertEquals("Good morning Melissa", actual);
    }
    
    

}