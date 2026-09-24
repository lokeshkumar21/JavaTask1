class CreditReport {

    private int creditScore;

    public CreditReport(int creditScore) {
        this.creditScore = creditScore;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void displayCreditScore() {
        System.out.println("Credit Score : " + creditScore);
    }
}