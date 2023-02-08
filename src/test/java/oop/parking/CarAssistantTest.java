package oop.parking;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarAssistantTest {
    private CarAssistant carAssistant;

    @BeforeEach
    void setup(){
        carAssistant = new CarAssistant();
        ParkingLot parkingLot = new ParkingLot();

        carAssistant.addParkingLot(parkingLot);
    }

    @Test
    public void itShouldAddAParkingLot() {
        ParkingLot parkingLot = new ParkingLot();

        carAssistant.addParkingLot(parkingLot);

        assertEquals(2, carAssistant.getParkingLots().size());
    }

    @Test
    public void itShouldParkACar() {
        carAssistant.assistParking("LOV-95");

        assertTrue(carAssistant.getParkedCar().contains("LOV-95"));
    }

    @Test
    public void itShouldReturnAParkedCar() {
        carAssistant.assistParking("LOV-96");
        String targetCar = carAssistant.assistReturning("LOV-96");

        assertEquals("LOV-96", targetCar);
    }

    @Test
    public void itShouldNotParkTheCar() {
        CarAssistant carAssistant1 = new CarAssistant();
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.park("LOV-90");
        parkingLot.park("LOV-91");
        parkingLot.park("LOV-92");
        parkingLot.park("LOV-93");
        parkingLot.park("LOV-94");
        parkingLot.park("LOV-95");
        parkingLot.park("LOV-96");
        parkingLot.park("LOV-97");

        carAssistant1.addParkingLot(parkingLot);
        carAssistant1.assistParking("LOV-98");

        assertFalse(carAssistant1.getParkedCar().contains("LOV-98"));
        //assertEquals(8, carAssistant1.getParkedCar().size());

    }

}