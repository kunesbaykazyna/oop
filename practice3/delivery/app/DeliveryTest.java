package practice3.delivery.app;

import practice3.delivery.model.*;
import practice3.delivery.service.DeliveryService;
import java.util.*;

public class DeliveryTest {
    public static void main(String[] args) {
        Engine v6 = new Engine("V6", 300);
        Engine diesel = new Engine("Diesel", 450);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Toyota Camry", 20000, v6, 5));
        vehicles.add(new Truck("Volvo FH", 80000, diesel, 20000));

        DeliveryService service = new DeliveryService();
        
        service.printAllVehicles(vehicles);
        service.calculateAllDeliveries(vehicles);
        
        System.out.println("\nTotal Fleet Delivery Cost: " + service.calculateTotalCost(vehicles));
    }
}
