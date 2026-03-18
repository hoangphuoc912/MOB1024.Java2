package entity;

public class Vehicle {
    private String id;
    private String name;
    private double baseCost;

    public Vehicle() {}

    public Vehicle(String id, String name, double baseCost) {
		this.setId(id);
		this.name = name;
		this.setBaseCost(baseCost);
    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
		if(id != "") {
			this.id = id;
			return true;
		}
		return false;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public boolean setBaseCost(double baseCost) {
        if (baseCost >= 0) {
            this.baseCost = baseCost;
            return true;
        }
        return false;
    }

    public double totalCost() {
        return baseCost;
    }

    @Override
    public String toString() {
        return "Vehicle [id=" + id +", name=" + name + ", baseCost=" + baseCost + ", totalCost=" + totalCost() + "]";
    }
}