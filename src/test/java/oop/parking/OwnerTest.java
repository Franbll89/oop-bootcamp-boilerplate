package oop.parking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    public void itShouldReturnTheUsedPercentageOfParkingLot() {
        Owner owner = new Owner();
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.addPropertyChangeListener(owner);

        parkingLot.park(new Car("LOV-90"));
        parkingLot.park(new Car("LOV-91"));
        parkingLot.park(new Car("LOV-92"));
        parkingLot.park(new Car("LOV-93"));

        assertEquals(40.0, owner.getUsedCapacityPercentage());

    }

    @Test
    public void itShouldNotifyTheOwnerIfPercentageIsUnder20Percent() {
        Owner owner = new Owner();
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.addPropertyChangeListener(owner);

        parkingLot.park(new Car("LOV-90"));
        boolean actual = owner.isUsedCapacityPercentageUnder20Percent();

        assertTrue(actual);

    }

    @Test
    public void itShouldNotNotifyTheOwnerIfPercentageIsUnder20Percent() {
        Owner owner = new Owner();
        ParkingLot parkingLot = new ParkingLot(10);
        parkingLot.addPropertyChangeListener(owner);

        parkingLot.park(new Car("LOV-90"));
        parkingLot.park(new Car("LOV-91"));
        parkingLot.park(new Car("LOV-92"));
        boolean actual = owner.isUsedCapacityPercentageUnder20Percent();

        assertFalse(actual);

    }

}