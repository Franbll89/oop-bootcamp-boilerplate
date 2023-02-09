package oop.parking;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Owner implements PropertyChangeListener {

    private double usedCapacityPercentage;
    private boolean isUsedCapacityPercentageUnder20Percent;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setUsedCapacityPercentage((double) evt.getNewValue());
        this.setUsedCapacityPercentageUnder20Percent(this.usedCapacityPercentage<20);
    }

    public double getUsedCapacityPercentage() {
        return usedCapacityPercentage;
    }

    public void setUsedCapacityPercentage(double usedCapacityPercentage) {
        this.usedCapacityPercentage = usedCapacityPercentage;
    }

    public boolean isUsedCapacityPercentageUnder20Percent() {
        return isUsedCapacityPercentageUnder20Percent;
    }

    private void setUsedCapacityPercentageUnder20Percent(boolean usedCapacityPercentageUnder20Percent) {
        this.isUsedCapacityPercentageUnder20Percent = usedCapacityPercentageUnder20Percent;
    }

}
