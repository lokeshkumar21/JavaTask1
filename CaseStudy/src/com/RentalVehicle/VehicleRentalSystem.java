package com.RentalVehicle;

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Car car = new Car(
                "TN-45-AB-1234",
                "Toyota",
                "Corolla",
                50,
                4
        );

        Bike bike = new Bike(
                "TN-45-CD-5678",
                "Yamaha",
                "R15",
                25,
                true
        );

        Truck truck = new Truck(
                "TN-45-EF-9012",
                "Tata",
                "Prima",
                100,
                10
        );

        System.out.println("=================================");
        System.out.println("        VEHICLE DETAILS");
        System.out.println("=================================");

        System.out.println("\n--- Car ---");
        car.displayVehicleDetails();

        System.out.println("\n--- Bike ---");
        bike.displayVehicleDetails();

        System.out.println("\n--- Truck ---");
        truck.displayVehicleDetails();

        Address address = new Address(
                "12",
                "Anna Nagar Main Road",
                "Trichy",
                "620018"
        );

        Customer customer = new Customer(
                "C001",
                "Lokesh Kumar",
                "9876543210",
                address
        );

        Rental rental = new Rental(
                "R001",
                5,
                customer,
                car
        );

        System.out.println("\n=================================");
        System.out.println("        RENTAL DETAILS");
        System.out.println("=================================");

        rental.displayRentalDetails();

        System.out.println("\n=================================");
        System.out.println("        POLYMORPHISM");
        System.out.println("=================================");

        Vehicle vehicle;

        vehicle = car;
        System.out.println("\n--- Vehicle Reference -> Car ---");
        vehicle.displayVehicleDetails();

        vehicle = bike;
        System.out.println("\n--- Vehicle Reference -> Bike ---");
        vehicle.displayVehicleDetails();

        vehicle = truck;
        System.out.println("\n--- Vehicle Reference -> Truck ---");
        vehicle.displayVehicleDetails();
    }
}

