package oop.greeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    public void itShouldGreetClaudia() {
        Greeter greeter = new Greeter();

        String actual = greeter.greet("Claudia");

        assertEquals("Hello Claudia", actual);
    }

    @Test
    public void itShouldGreetFrancesco() {
        Greeter greeter = new Greeter();

        String actual = greeter.greet("Francesco");

        assertEquals("Hello Francesco", actual);
    }

}