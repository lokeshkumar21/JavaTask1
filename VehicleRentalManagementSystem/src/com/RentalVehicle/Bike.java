package com.RentalVehicle;

class Bike extends Vehicle {

    private boolean helmetIncluded;

    Bike(String vehicleNumber, String brand, String model,
         double rentPerDay, boolean helmetIncluded) {

        super(vehicleNumber, brand, model, rentPerDay);

        this.helmetIncluded = helmetIncluded;
    }

    @Override
    void displayVehicleDetails() {

        super.displayVehicleDetails();

        System.out.println("Helmet Included : " + helmetIncluded);
    }
}