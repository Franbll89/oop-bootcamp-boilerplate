package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class CarAssistant {

    private static final int MAXIMUM_PARKED_CARS_CAPACITY = 80;
    private List<ParkingLot> parkingLots;

    public CarAssistant() {
        this.parkingLots = new ArrayList<>();
    }

    public boolean assistParking(Car car){
        return car.parkCar(this);
    }

    public Car assistReturning(Car car){
        return this.parkingLots.get(0).returnCar(car);
    }

    public List<Car> getParkedCar() {
        return new ArrayList<>();
    }


    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public boolean isParkingAvailable(ParkingLot parkingLot){
        return !isBelow80Percent(parkingLot);
    }

    private static boolean isBelow80Percent(ParkingLot parkingLot) {
        return (parkingLot.getParkedCarList().size() * 100 / parkingLot.getCapacity()) >= MAXIMUM_PARKED_CARS_CAPACITY;
    }

}
