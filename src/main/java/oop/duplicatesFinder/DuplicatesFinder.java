package oop.duplicatesFinder;

import java.util.*;

public class DuplicatesFinder {
    public static List<String> findDuplicates(List<String> inputList) {
        final Set<String> setOfDuplicatedValues = new HashSet<>();
        final Set<String> setOfUniqueValues = new HashSet<>();

        for (String currentString : inputList) {
            if (!setOfUniqueValues.add(currentString)) {
                setOfDuplicatedValues.add(currentString);
            }
        }
        return new ArrayList<>(setOfDuplicatedValues);
    }
}
