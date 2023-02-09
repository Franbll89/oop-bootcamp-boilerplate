package oop.parking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarAssistantTest {
    private CarAssistant carAssistant;

    @BeforeEach
    void setup(){
        carAssistant = new CarAssistant();
        ParkingLot parkingLot = new ParkingLot(10);
        carAssistant.addParkingLot(parkingLot);
    }

    @Test
    public void itShouldAddAParkingLot() {
        ParkingLot parkingLot = new ParkingLot(10);

        carAssistant.addParkingLot(parkingLot);

        assertEquals(2, carAssistant.getParkingLots().size());
    }

    @Test
    public void itShouldParkACar() {
        //carAssistant.assistParking(new Car("LOV-95"));

        assertTrue(carAssistant.assistParking(new Car("LOV-95")));
    }

    @Test
    public void itShouldReturnAParkedCar() {
        carAssistant.assistParking(new Car("LOV-96"));
        Car targetCar = carAssistant.assistReturning(new Car("LOV-96"));

        assertEquals(new Car("LOV-96"), targetCar);
    }

    @Test
    public void itShouldNotParkTheCar() {
        ParkingLot parking1 = new ParkingLot(1);
        ParkingLot parking2 = new ParkingLot(5);
        CarAssistant assistant = new CarAssistant();
        assistant.addParkingLot(parking1);
        assistant.addParkingLot(parking2);
        assistant.assistParking(new Car("LOV-90"));
        assistant.assistParking(new Car("LOV-91"));
        assistant.assistParking(new Car("LOV-92"));
        assistant.assistParking(new Car("LOV-93"));

        assertTrue(assistant.assistParking(new Car("LOV-94")));
        assertFalse(assistant.assistParking(new Car("LOV-95")));

    }

    @Test
    public void itShouldParkLargeCarInLeastFullParking() {
        ParkingLot parking1 = new ParkingLot(3);
        ParkingLot parking2 = new ParkingLot(5);
        CarAssistant assistant = new CarAssistant();
        assistant.addParkingLot(parking1);
        assistant.addParkingLot(parking2);
        assistant.assistParking(new Car("LOV-90"));
        Car largeCar = new LargeCar("LOV-91");
        assistant.assistParking(largeCar);

        assertTrue(parking2.getParkedCarList().contains(largeCar));
    }

}