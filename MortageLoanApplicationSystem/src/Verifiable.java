interface Verifiable {

    void verify();

    default void verificationMessage() {
        System.out.println("Verification completed.");
    }

    static void systemMessage() {
        System.out.println("Starting verification process...");
    }
}