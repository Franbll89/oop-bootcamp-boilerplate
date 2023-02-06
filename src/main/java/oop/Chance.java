package oop;

public class Chance {

    private final static int NUMBER_OF_EVENTS = 6;
    public double calculateOddsToGetASix() { return 1.0 / NUMBER_OF_EVENTS; }

    public double calculateOddsToNotGetASix() {
        return 1 - calculateOddsToGetASix();
    }

    public double calculateOddsOfTwoChances(){
        return Math.pow(calculateOddsToGetASix(), 2);
    }


}
