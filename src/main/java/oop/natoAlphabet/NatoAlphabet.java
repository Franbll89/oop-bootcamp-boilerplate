package oop.natoAlphabet;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.entry;

public class NatoAlphabet {

    private BiMap<String, String> alphabetBiMap;

    public NatoAlphabet() {
        alphabetBiMap = HashBiMap.create(alphabet);
    }

    public String encode(String input) {
        String[] separateCharacters = input.split("");
        return Arrays.stream(separateCharacters)
                .map(encodeCharacter())
                .collect(Collectors.joining("-"));
    }

    public String decode(String input) {
        String[] separateCharacters = input.split("-");
        return Arrays.stream(separateCharacters)
                .map(decodeCharacter())
                .collect(Collectors.joining(""));
    }

    private Function<String, String> encodeCharacter() {
        return character -> Objects.requireNonNull(alphabetBiMap.get(character), "input outside NATO alphabet");
    }

    private Function<String, String> decodeCharacter() {
        return character -> Objects.requireNonNull(alphabetBiMap.inverse().get(character), "input outside NATO alphabet");
    }

    private final Map<String, String> alphabet = Map.ofEntries(
            entry("a", "alpha"),
            entry("b", "bravo"),
            entry("c", "charlie"),
            entry("d", "delta"),
            entry("e", "echo"),
            entry("f", "foxtrot"),
            entry("g", "golf"),
            entry("h", "hotel"),
            entry("i", "india"),
            entry("j", "juliett"),
            entry("k", "kilo"),
            entry("l", "lima"),
            entry("m", "mike"),
            entry("n", "november"),
            entry("o", "oscar"),
            entry("p", "papa"),
            entry("q", "quebec"),
            entry("r", "romeo"),
            entry("s", "sierra"),
            entry("t", "tango"),
            entry("u", "uniform"),
            entry("v", "victor"),
            entry("w", "whiskey"),
            entry("x", "xray"),
            entry("y", "yankee"),
            entry("z", "zulu"),
            entry("1", "one"),
            entry("2", "two"),
            entry("3", "three"),
            entry("4", "four"),
            entry("5", "five"),
            entry("6", "six"),
            entry("7", "seven"),
            entry("8", "eight"),
            entry("9", "nine"),
            entry("0", "zero"),
            entry(" ", "null")
    );
}
