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
        carAssistant.assistParking(new Car("LOV-95"));

        assertTrue(carAssistant.getParkedCar().contains(new Car("LOV-95")));
    }

    @Test
    public void itShouldReturnAParkedCar() {
        carAssistant.assistParking(new Car("LOV-96"));
        Car targetCar = carAssistant.assistReturning(new Car("LOV-96"));

        assertEquals(new Car("LOV-96"), targetCar);
    }

    @Test
    public void itShouldNotParkTheCar() {
        carAssistant.assistParking(new Car("LOV-90"));
        carAssistant.assistParking(new Car("LOV-91"));
        carAssistant.assistParking(new Car("LOV-92"));
        carAssistant.assistParking(new Car("LOV-93"));
        carAssistant.assistParking(new Car("LOV-94"));
        carAssistant.assistParking(new Car("LOV-95"));
        carAssistant.assistParking(new Car("LOV-96"));
        carAssistant.assistParking(new Car("LOV-97"));

        carAssistant.assistParking(new Car("LOV-98"));

        assertFalse(carAssistant.getParkedCar().contains(new Car("LOV-98")));

    }

}