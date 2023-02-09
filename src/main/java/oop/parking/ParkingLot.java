package oop.parking;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static final int LIMIT_PERCENTAGE_TO_NOTIFY = 75;
    public static final int PARKING_LOT_MAXIMUM_CAPACITY_PERCENTAGE = 10;
    private List<String> parkedCarList = new ArrayList<>();

    private PropertyChangeSupport support;

    public ParkingLot() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void park(String car) {
        double percentageBeforeParking = checkPercentage();
        this.parkedCarList.add(car);
        support.firePropertyChange("usedCapacityPercentage", percentageBeforeParking, checkPercentage());
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

    private boolean is75Percent() {
        return (this.parkedCarList.size() * 100 / PARKING_LOT_MAXIMUM_CAPACITY_PERCENTAGE) == LIMIT_PERCENTAGE_TO_NOTIFY;
    }

    private double checkPercentage(){
        return this.parkedCarList.size() * 100 / PARKING_LOT_MAXIMUM_CAPACITY_PERCENTAGE;
    }

}
