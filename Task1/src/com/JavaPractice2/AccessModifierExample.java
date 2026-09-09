package com.JavaPractice2;

class Employees {

    private int salary = 30000;

    public String name = "Lokesh";

    protected String department = "IT";

    String company = "ABC";

    void display() {

        System.out.println("Private Salary: " + salary);
        System.out.println("Public Name: " + name);
        System.out.println("Protected Department: " + department);
        System.out.println("Default Company: " + company);
    }
}
public class AccessModifierExample {

    public static void main(String[] args) {

        Employees e = new Employees();

        e.display();

        System.out.println("Public: " + e.name);
        System.out.println("Protected: " + e.department);
        System.out.println("Default: " + e.company);
    }
}

