package Vehicles;

import java.text.DecimalFormat;

public class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String driving(double distance) {
        double fuelNeeded = distance * fuelConsumption;
        if (fuelNeeded > this.fuelQuantity) {
            if (this instanceof Car) {
                return "Car needs refueling";
            } else if (this instanceof Truck) {
                return "Truck needs refueling";
            } else if (this instanceof Bus){
                return "Bus needs refueling";
            }
        }

            this.fuelQuantity = this.fuelQuantity - fuelNeeded;
            DecimalFormat ds = new DecimalFormat("##.##");
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), ds.format(distance));

    }

    public void refueling(double liters) {
        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (liters > this.tankCapacity){
            System.out.println("Cannot fit fuel in tank");
            return;
        }
       this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
