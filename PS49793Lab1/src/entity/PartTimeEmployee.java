package entity;

public class PartTimeEmployee extends Employee {
    private int workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, int workingHours, double hourlyRate) {
        super(id, name, 0);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double income() {
        return workingHours * hourlyRate;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee [" + "id=" + getId() + ", name=" + getName() + ", workingHours=" + workingHours + ", hourlyRate=" + hourlyRate + ", income=" + income() + "]";
    }
}