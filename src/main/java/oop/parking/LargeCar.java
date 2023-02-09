package oop.parking;

import java.util.List;

public class LargeCar extends Car implements ParkingStrategy {

    public LargeCar(String plate) {
        super(plate, Size.LARGE);
    }

    @Override
    public boolean parkCar(List<ParkingLot> parkingLots) {
        // check all capacity
        parkingLots.stream().min()
        // park in lowest used
        return false;
    }
}
