package oop;

public class Chance {

    public double calculateChanceToGetASixFromADiceRoll() {
        return 1.0 / 6;
    }

    public double calculateChanceToNotGetASixFromADiceRoll() {
        return 1 - 1.0 / 6;
    }

}
