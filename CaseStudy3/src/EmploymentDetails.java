class EmploymentDetails {

    private String companyName;
    private double annualIncome;

    public EmploymentDetails(String companyName, double annualIncome) {
        this.companyName = companyName;
        this.annualIncome = annualIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void displayEmploymentDetails() {
        System.out.println("Company       : " + companyName);
        System.out.println("Annual Income : ₹" + annualIncome);
    }
}