package oop.parking;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<Car> carList = new ArrayList<>();

    public void park(Car car) {
        this.carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

}
