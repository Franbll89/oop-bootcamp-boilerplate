package oop.parking;

import java.util.Comparator;

public class LargeCar extends Car {

    public LargeCar(String plate) {
        super(plate, Size.LARGE);
    }

    @Override
    public boolean parkCar(CarAssistant carAssistant) {
        return carAssistant.getParkingLots().stream().min(
            Comparator.comparingDouble(ParkingLot::checkPercentage)
        ).get().park(this);
    }
}
