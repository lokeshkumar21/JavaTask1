package com.RentalVehicle;

class Truck extends Vehicle {

    private double loadCapacity;

    Truck(String vehicleNumber, String brand, String model,
          double rentPerDay, double loadCapacity) {

        super(vehicleNumber, brand, model, rentPerDay);

        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Load Capacity : " + loadCapacity + " tons");
    }
}