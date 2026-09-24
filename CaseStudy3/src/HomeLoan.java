class HomeLoan extends MortgageLoanApplication {

    public HomeLoan(
            String applicationId,
            double loanAmount,
            int tenure,
            Customer customer,
            EmploymentDetails employmentDetails,
            Property property,
            CreditReport creditReport) {

        super(
                applicationId,
                loanAmount,
                tenure,
                customer,
                employmentDetails,
                property,
                creditReport
        );
    }

    @Override
    public void checkEligibility() {

        if (getCreditReport().getCreditScore() >= 700
                && getEmploymentDetails().getAnnualIncome() >= 500000
                && getProperty().getPropertyValue() >= getLoanAmount()) {

            System.out.println("Eligibility : Approved");
        } else {
            System.out.println("Eligibility : Rejected");
        }
    }
}
