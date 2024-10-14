package Vehicles;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] tokens = scanner.nextLine().split("\\s+");
        Vehicle car = createVehicle(tokens);

        tokens = scanner.nextLine().split("\\s+");
       Vehicle truck = createVehicle(tokens);

        tokens = scanner.nextLine().split("\\s+");
        Vehicle bus = createVehicle(tokens);

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            String typeVehicle = tokens[1];

            switch (command){
                case "Drive":
                    double distance = Double.parseDouble(tokens[2]);
                    Vehicle vehicle = vehicles.get(typeVehicle);
                    if (vehicle instanceof Bus) {
                        bus.setFuelConsumption(bus.getFuelConsumption() + Bus.ADDITIONAL_FULL_BUSS_CONSUMPTION);
                        System.out.println(bus.driving(distance));
                        bus.setFuelConsumption(bus.getFuelConsumption() - Bus.ADDITIONAL_FULL_BUSS_CONSUMPTION);
                        continue;

                    }
                    String driveMessage = vehicles.get(typeVehicle).driving(distance);
                    System.out.println(driveMessage);
                    break;
                case "Refuel":
                    double fuelAmount = Double.parseDouble(tokens[2]);
                    vehicles.get(typeVehicle).refueling(fuelAmount);
                    break;
                case "DriveEmpty":
                    double driveEmpty = Double.parseDouble(tokens[2]);
                    String driveEmptyMessage = bus.driving(driveEmpty);
                    System.out.println(driveEmptyMessage);
                    break;
            }

        }
        vehicles.values().forEach(System.out::println);
    }

    private static Vehicle createVehicle(String[] tokens) {
        String vehicleType = tokens[0];
        double fuelQuantity = Double.parseDouble(tokens[1]);
        double fuelConsumption = Double.parseDouble(tokens[2]);
        double tankCapacity = Double.parseDouble(tokens[3]);

        Vehicle vehicle = null;
        switch (vehicleType) {
            case "Car":
                vehicle = new Car(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Truck":
                vehicle = new Truck(fuelQuantity, fuelConsumption, tankCapacity);
                break;
            case "Bus":
                vehicle = new Bus(fuelQuantity, fuelConsumption, tankCapacity);
                break;
        }
        return vehicle;
    }
}
