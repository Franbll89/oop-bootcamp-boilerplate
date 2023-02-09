package oop.parking;

import java.util.List;

public interface ParkingStrategy {
    boolean parkCar(List<ParkingLot> parkingLots);
}
