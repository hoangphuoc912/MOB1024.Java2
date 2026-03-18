package entity;

public class Motorbike extends Vehicle {
    private double maintenanceCost;

    public Motorbike(String id, String name, double baseCost, double maintenanceCost) {
        super(id, name, baseCost);
        setMaintenanceCost(maintenanceCost);
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public boolean setMaintenanceCost(double maintenanceCost) {
        if (maintenanceCost >= 0) {
            this.maintenanceCost = maintenanceCost;
            return true;
        }
        return false;
    }

    @Override
    public double totalCost() {
        return getBaseCost() + maintenanceCost;
    }

    @Override
    public String toString() {
        return "Motorbike [id=" + getId() + ", name=" + getName() + ", baseCost=" + getBaseCost() + ", maintenanceCost=" + maintenanceCost + ", totalCost=" + totalCost() + "]";
    }
}