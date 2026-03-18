package entity;

public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;

    public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
        super(id, name, basicSalary);
        this.bonus = bonus;
        this.penalty = penalty;
    }

    @Override
    public double income() {
        return getBasicSalary() + bonus - penalty;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee [" + "id=" + getId() + ", name=" + getName() + ", basicSalary=" + getBasicSalary() + ", bonus=" + bonus + ", penalty=" + penalty + ", income=" + income() + "]";
    }
}