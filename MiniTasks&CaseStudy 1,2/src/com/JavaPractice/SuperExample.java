package com.JavaPractice;

class Employee {

    String name = "Employee";

    Employee() {
        System.out.println("Employee constructor");
    }

    void work() {
        System.out.println("Employee is working");
    }
}

class Developers extends Employee {

    String name = "Developer";

    Developers() {
        super();
        System.out.println("Developer constructor");
    }

    void display() {

        System.out.println(name);

        System.out.println(super.name);

        super.work();
    }
}

public class SuperExample {

    public static void main(String[] args) {

        Developers d = new Developers();

        d.display();
    }
}