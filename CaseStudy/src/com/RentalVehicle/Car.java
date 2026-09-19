package com.RentalVehicle;

/**
 * Represent a car in VRS
 */

class Car extends Vehicle {

    /**
     * Display car details
     */
    private int numberOfDoors;

    Car(String vehicleNumber, String brand, String model,
        double rentPerDay, int numberOfDoors) {

        super(vehicleNumber, brand, model, rentPerDay);

        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Number of Doors : " + numberOfDoors);
    }
}