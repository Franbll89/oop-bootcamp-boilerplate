package oop.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    public void itShouldParkACar() {
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.park(new Car("LOV-95"));

        assertTrue(parkingLot.getParkedCarList().contains(new Car("LOV-95")));
    }

    @Test
    public void itShouldExitAGivenCar() {
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.park(new Car("LOV-96"));
        Car targetCar = parkingLot.returnCar(new Car("LOV-96"));

        assertEquals(new Car("LOV-96"), targetCar);
    }

}