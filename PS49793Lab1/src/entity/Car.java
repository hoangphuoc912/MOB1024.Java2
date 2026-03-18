package entity;

public class Car extends Vehicle {
    private double taxRate;
    private double insuranceFee;

    public Car() {}
    public Car(String id, String name, double baseCost, double taxRate, double insuranceFee) {
        super(id, name, baseCost);
        setTaxRate(taxRate);
        setInsuranceFee(insuranceFee);
    }

    public double getTaxRate() {
        return taxRate;
    }

    public boolean setTaxRate(double taxRate) {
        if (taxRate >= 0 && taxRate <= 1) {
            this.taxRate = taxRate;
            return true;
        }
        return false;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public boolean setInsuranceFee(double insuranceFee) {
        if (insuranceFee >= 0) {
            this.insuranceFee = insuranceFee;
            return true;
        }
        return false;
    }

    @Override
    public double totalCost() {
        double base = getBaseCost();
        return base + base * taxRate + insuranceFee;
    }

    @Override
    public String toString() {
        return "Car [id=" + getId() + ", name=" + getName() + ", baseCost=" + getBaseCost() + ", taxRate=" + taxRate + ", insuranceFee=" + insuranceFee + ", totalCost=" + totalCost() + "]";
    }
}