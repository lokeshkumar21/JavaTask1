package com.JavaPractice;

class Employees {

    final int salary = 30000;

    final void rules() {
        System.out.println("Employee must follow rules");
    }
}

public class FinalExample {

    public static void main(String[] args) {

        Employees e = new Employees();

        System.out.println("Salary: " + e.salary);

        e.rules();
    }
}