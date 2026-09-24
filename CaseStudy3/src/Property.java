class Property {

    private String propertyType;
    private double propertyValue;

    public Property(String propertyType, double propertyValue) {
        this.propertyType = propertyType;
        this.propertyValue = propertyValue;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void displayPropertyDetails() {
        System.out.println("Property Type  : " + propertyType);
        System.out.println("Property Value : ₹" + propertyValue);
    }
}