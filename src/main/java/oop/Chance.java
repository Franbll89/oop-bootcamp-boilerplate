package oop;

public class Chance {

    private final static int NUMBER_OF_EVENTS = 6;
    private double value;

    public Chance() {
    }

    public Chance(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double calculateOddsToGetASix() { return 1.0 / NUMBER_OF_EVENTS; }

    public double calculateOddsToNotGetASix() {
        return 1 - calculateOddsToGetASix();
    }

    public Chance calculateOddsOfTwoChances(Chance chance){
        return new Chance(this.value* chance.getValue());
    }


}
