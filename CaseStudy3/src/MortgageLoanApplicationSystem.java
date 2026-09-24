public class MortgageLoanApplicationSystem {

    public static void main(String[] args) {

        System.out.println("=== Mortgage Loan Application System ===");

        Customer customer =
                new Customer("C101", "Arun", "9876543210");

        EmploymentDetails employment =
                new EmploymentDetails("ABC Technologies", 800000);

        Property property =
                new Property("Independent House", 5000000);

        CreditReport credit =
                new CreditReport(750);

        MortgageLoanApplication loan =
                new HomeLoan(
                        "M101",
                        4000000,
                        20,
                        customer,
                        employment,
                        property,
                        credit
                );

        System.out.println("\n--- Customer Details ---");
        customer.displayCustomerDetails();

        System.out.println("\n--- Employment Details ---");
        employment.displayEmploymentDetails();

        System.out.println("\n--- Property Details ---");
        property.displayPropertyDetails();

        System.out.println("\n--- Credit Details ---");
        credit.displayCreditScore();

        System.out.println("\n--- Eligibility Check ---");
        loan.checkEligibility();

        System.out.println("\n--- Loan Calculation ---");
        loan.calculateLoan();

        System.out.println("\n--- Method Overloading ---");
        loan.calculateLoan(4000000);
        loan.calculateLoan(4000000, 7.5);

        System.out.println("\n--- Verification ---");

        Verifiable.systemMessage();

        Verifiable employmentVerifier =
                new EmploymentVerifier();

        Verifiable creditVerifier =
                new CreditVerifier();

        Verifiable propertyVerifier =
                new PropertyVerifier();

        employmentVerifier.verify();
        creditVerifier.verify();
        propertyVerifier.verify();

        employmentVerifier.verificationMessage();

        System.out.println("\n--- Loan Processing ---");
        loan.processApplication();
    }
}