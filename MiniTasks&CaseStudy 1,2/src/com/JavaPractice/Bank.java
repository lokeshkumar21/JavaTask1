package com.JavaPractice;
class BankAccount {

    void deposit() {
        System.out.println("Bank provides deposit facility");
    }
}

class SBI extends BankAccount {

    void loan() {
        System.out.println("SBI provides home loan");
    }
}

public class Bank {

    public static void main(String[] args) {

        SBI s = new SBI();

        s.deposit();
        s.loan();
    }
}