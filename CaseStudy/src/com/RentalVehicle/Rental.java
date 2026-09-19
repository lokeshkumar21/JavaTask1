package com.RentalVehicle;

class Rental {

    private String rentalId;
    private int rentalDays;
    private Customer customer;
    private Vehicle vehicle;

    Rental(String rentalId, int rentalDays,
           Customer customer, Vehicle vehicle) {

        this.rentalId = rentalId;
        this.rentalDays = rentalDays;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    double calculateTotalCost() {

        return rentalDays * vehicle.getRentPerDay();
    }

    void displayRentalDetails() {

        System.out.println("Rental ID    : " + rentalId);
        System.out.println("Rental Days  : " + rentalDays);

        customer.displayCustomerDetails();

        System.out.println("--- Vehicle ---");

        vehicle.displayVehicleDetails();

        System.out.println("Total Amount : €" + calculateTotalCost());
    }
}
