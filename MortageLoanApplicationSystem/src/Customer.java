class Customer {

    private String customerId;
    private String customerName;
    private String phoneNumber;

    public Customer(String customerId, String customerName, String phoneNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + phoneNumber);
    }
}