package oop.parking;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private static final int LIMIT_PERCENTAGE_TO_NOTIFY = 75;
    private List<Car> parkedCarList = new ArrayList<>();

    public Integer getCapacity() {
        return capacity;
    }

    private Integer capacity;

    private PropertyChangeSupport support;

    public ParkingLot(Integer capacity) {
        this.support = new PropertyChangeSupport(this);
        this.capacity = capacity;
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
        return (this.parkedCarList.size() * 100 / this.capacity) == LIMIT_PERCENTAGE_TO_NOTIFY;
    }

    private double checkPercentage(){
        return this.parkedCarList.size() * 100 / this.capacity;
    }

}
