package com.JavaPractice2;

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

interface Payment {

    void pay();
}

class Developer extends Employee implements Payment {

    void coding() {
        System.out.println("Developer is coding");
    }

    public void pay() {
        System.out.println("Employee receives salary");
    }
}

public class ExtendsImplements {

    public static void main(String[] args) {

        Developer d = new Developer();

        d.work();
        d.coding();
        d.pay();
    }
}