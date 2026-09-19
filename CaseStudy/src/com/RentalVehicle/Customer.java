package com.RentalVehicle;

class Customer {

    private String customerId;
    private String customerName;
    private String phoneNumber;
    private Address address;

    Customer(String customerId, String customerName,
             String phoneNumber, Address address) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    void displayCustomerDetails() {

        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + phoneNumber);

        System.out.println("--- Address ---");

        address.displayAddress();
    }
}