package oop.duplicatesFinder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesFinderTest {

    @Test
    public void itShouldListOfDuplicatedElements() {
        List<String> expected = Arrays.asList("a", "b");
        List<String> actual = DuplicatesFinder.findDuplicates(Arrays.asList("a", "b", "c", "a", "b", "d"));

        assertEquals(expected, actual);

    }

}