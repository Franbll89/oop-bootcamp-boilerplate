package oop.lifo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LifoTest {

    private Lifo lifo;

    @BeforeEach
    public void setUp() {
        lifo = new Lifo();
    }

    @Test
    public void itShouldPush() {
        Integer item = 5;

        lifo.push(item);
        assertTrue(lifo.getStack().contains(item));
    }

    @Test
    public void itShouldPopAndRemove() {
        lifo.push(5);
        lifo.push(42);

        Integer actual = lifo.pop();
        assertEquals(42, actual);
        assertEquals(List.of(5), lifo.getStack());
    }

    @Test
    public void itShouldPeekWithoutRemoving() {
        lifo.push(5);
        lifo.push(42);

        Integer actual = lifo.peek();
        assertEquals(42, actual);
        assertEquals(List.of(5, 42), lifo.getStack());
    }

}