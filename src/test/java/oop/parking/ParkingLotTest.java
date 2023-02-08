package oop.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    public void itShouldParkACar() {
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.park("LOV-95");

        assertTrue(parkingLot.getParkedCarList().contains("LOV-95"));
    }

    @Test
    public void itShouldExitAGivenCar() {
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.park("LOV-96");
        String targetCar = parkingLot.returnCar("LOV-96");

        assertEquals("LOV-96", targetCar);
    }

}