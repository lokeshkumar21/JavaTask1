package com.RentalVehicle;

class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String postalCode;

    Address(String houseNumber, String street,
            String city, String postalCode) {

        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    void displayAddress() {

        System.out.println("House Number : " + houseNumber);
        System.out.println("Street       : " + street);
        System.out.println("City         : " + city);
        System.out.println("Postal Code  : " + postalCode);
    }
}
