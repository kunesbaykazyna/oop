package practice3.delivery.model;

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(String model, double baseCost, Engine engine, double maxLoad) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost + (maxLoad * 0.2);
    }

    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return (distance * fuelPrice) + (maxLoad * 0.1);
    }
}