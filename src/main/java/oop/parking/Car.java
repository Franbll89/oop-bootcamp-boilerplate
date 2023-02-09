package oop.parking;

import java.util.Objects;

public class Car implements ParkingStrategy {

    private String plate;
    private Size size;

    @Override
    public boolean parkCar(CarAssistant carAssistant) {
        return false;
    }

    public enum Size{
        NORMAL,
        LARGE
    }

    public Car(String plate, Size size) {
        this.plate = plate;
        this.size = size;
    }

    public Car(String plate) {
        this.plate = plate;
        this.size = Size.NORMAL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return plate.equals(car.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate);
    }
}
