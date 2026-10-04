abstract class MortgageLoanApplication {

    private String applicationId;
    private double loanAmount;
    private int tenure;

    private Customer customer;
    private EmploymentDetails employmentDetails;
    private Property property;
    private CreditReport creditReport;

    public MortgageLoanApplication(
            String applicationId,
            double loanAmount,
            int tenure,
            Customer customer,
            EmploymentDetails employmentDetails,
            Property property,
            CreditReport creditReport) {

        this.applicationId = applicationId;
        this.loanAmount = loanAmount;
        this.tenure = tenure;
        this.customer = customer;
        this.employmentDetails = employmentDetails;
        this.property = property;
        this.creditReport = creditReport;
    }

    public abstract void checkEligibility();

    public void calculateLoan() {
        double interest = loanAmount * 0.08 * tenure;
        double totalAmount = loanAmount + interest;

        System.out.println("Loan Amount  : ₹" + loanAmount);
        System.out.println("Total Amount : ₹" + totalAmount);
    }

    public void processApplication() {
        System.out.println("Loan application is being processed.");
    }

    public void calculateLoan(double amount) {
        double interest = amount * 0.08;
        System.out.println("Estimated Interest : ₹" + interest);
    }

    public void calculateLoan(double amount, double rate) {
        double interest = amount * rate / 100;
        System.out.println("Estimated Interest : ₹" + interest);
    }

    public Customer getCustomer() {
        return customer;
    }

    public EmploymentDetails getEmploymentDetails() {
        return employmentDetails;
    }

    public Property getProperty() {
        return property;
    }

    public CreditReport getCreditReport() {
        return creditReport;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public int getTenure() {
        return tenure;
    }
}