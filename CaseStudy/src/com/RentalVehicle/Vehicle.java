package com.RentalVehicle;

/**
 * Represent Vehicle in the VRS
 */

class Vehicle {

    /**
     * Display vehicle details
     */
    private final String vehicleNumber;
    private final String brand;
    private final String model;
    private final double rentPerDay;



    Vehicle(String vehicleNumber, String brand, String model, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    void displayVehicleDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Brand      : " + brand);
        System.out.println("Model      : " + model);
        System.out.println("Rent Per Day : " + rentPerDay);
    }
}