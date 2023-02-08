package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<String> parkedCarList = new ArrayList<>();
    public final static int PARKING_MAXIMUM_CAPACITY = 10;

    public void park(String car) {
        this.parkedCarList.add(car);
    }

    public List<String> getParkedCarList() {
        return parkedCarList;
    }

    public String returnCar(String targetCar) {
        for (String car : parkedCarList) {
            if (car.equals(targetCar)){
                return car;
            }
        }
        return null;
    }

}
