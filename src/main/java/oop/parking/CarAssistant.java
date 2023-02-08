package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class CarAssistant {

    private List<ParkingLot> parkingLots;

    public CarAssistant() {
        this.parkingLots = new ArrayList<>();
    }

    public void assistParking(String car){
        ParkingLot actualParkingLot = this.parkingLots.get(0);
        if (actualParkingLot.getParkedCarList().size()<ParkingLot.PARKING_MAXIMUM_CAPACITY-2){
            this.parkingLots.get(0).park(car);
        }
        else{
            System.out.println("Parking lot is almost full!");
        }
    }

    public String assistReturning(String car){
        return this.parkingLots.get(0).returnCar(car);
    }

    public List<String> getParkedCar() {
        return parkingLots.get(0).getParkedCarList();
    }


    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }
}
