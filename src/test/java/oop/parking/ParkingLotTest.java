package oop.parking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    public void itShouldParkACar() {
        Car car = new Car();
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.park(car);

        assertTrue(parkingLot.getCarList().contains(car));

    }

}