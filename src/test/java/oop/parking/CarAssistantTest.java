package oop.parking;

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
        carAssistant.assistParking("LOV-90");
        carAssistant.assistParking("LOV-91");
        carAssistant.assistParking("LOV-92");
        carAssistant.assistParking("LOV-93");
        carAssistant.assistParking("LOV-94");
        carAssistant.assistParking("LOV-95");
        carAssistant.assistParking("LOV-96");
        carAssistant.assistParking("LOV-97");

        carAssistant.assistParking("LOV-98");

        assertFalse(carAssistant.getParkedCar().contains("LOV-98"));

    }

}