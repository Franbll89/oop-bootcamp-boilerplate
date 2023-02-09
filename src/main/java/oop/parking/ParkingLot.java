package oop.parking;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static final int LIMIT_PERCENTAGE_TO_NOTIFY = 75;
    public static final int PARKING_LOT_MAXIMUM_CAPACITY_PERCENTAGE = 10;
    private List<Car> parkedCarList = new ArrayList<>();

    private PropertyChangeSupport support;

    public ParkingLot() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void park(Car car) {
        double percentageBeforeParking = checkPercentage();
        this.parkedCarList.add(car);
        support.firePropertyChange("usedCapacityPercentage", percentageBeforeParking, checkPercentage());
    }

    public List<Car> getParkedCarList() {
        return parkedCarList;
    }

    public Car returnCar(Car targetCar) {
        for (Car car : parkedCarList) {
            if (car.equals(targetCar)){
                return car;
            }
        }
        return null;
    }

    private boolean is75Percent() {
        return (this.parkedCarList.size() * 100 / PARKING_LOT_MAXIMUM_CAPACITY_PERCENTAGE) == LIMIT_PERCENTAGE_TO_NOTIFY;
    }

    private double checkPercentage(){
        return this.parkedCarList.size() * 100 / PARKING_LOT_MAXIMUM_CAPACITY_PERCENTAGE;
    }

}
