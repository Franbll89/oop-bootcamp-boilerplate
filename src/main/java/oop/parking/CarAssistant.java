package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class CarAssistant {

    private static final int MAXIMUM_PARKED_CARS_CAPACITY = 80;
    private List<ParkingLot> parkingLots;

    public CarAssistant() {
        this.parkingLots = new ArrayList<>();
    }

    public void assistParking(Car car){
        ParkingLot actualParkingLot = this.parkingLots.get(0);
        if (isParkingAvailable(actualParkingLot)){
            actualParkingLot.park(car);
        }
        else{
            System.out.println("Parking lot is full! Please try it later!");
        }
    }

    public Car assistReturning(Car car){
        return this.parkingLots.get(0).returnCar(car);
    }

    public List<Car> getParkedCar() {
        return parkingLots.get(0).getParkedCarList();
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
        return (parkingLot.getParkedCarList().size() * 100 / ParkingLot.PARKING_LOT_MAXIMUM_CAPACITY_PERCENTAGE) >= MAXIMUM_PARKED_CARS_CAPACITY;
    }

}
