package oop;

import java.lang.reflect.Array;

public class Dice {

    private static int[] faces= {1,2,3,4,5,6};

    public double calculateProbabilityToGetASix() {
        return 1.0/faces.length;
    }
}
