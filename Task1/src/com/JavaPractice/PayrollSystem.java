package com.JavaPractice;

abstract class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    abstract double calculateSalary();

    abstract String getRole();

    abstract double getAllowance();
}


// Level 1
class Developer extends Employee {

    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double getAllowance() {
        return 5000;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + getAllowance();
    }

    @Override
    String getRole() {
        return "Developer";
    }
}



// Level 2
class SeniorDeveloper extends Developer {

    SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double getAllowance() {
        return 10000;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + getAllowance();
    }

    @Override
    String getRole() {
        return "Senior Developer";
    }
}


// Level 3
class TeamLead extends SeniorDeveloper {

    TeamLead(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double getAllowance() {
        return 15000;
    }

    @Override
    double calculateSalary() {
        return getBasicSalary() + getAllowance();
    }

    @Override
    String getRole() {
        return "Team Lead";
    }
}


public class PayrollSystem {

    public static void main(String[] args) {

        Employee e1 = new Developer(101, "Lokesh", 30000);
        Employee e2 = new SeniorDeveloper(102, "Kumar", 50000);
        Employee e3 = new TeamLead(103, "Tamizh", 70000);

        displayEmployee(e1);
        displayEmployee(e2);
        displayEmployee(e3);
    }

    static void displayEmployee(Employee employee) {

        System.out.println("-----------------------------");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Role: " + employee.getRole());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Allowance: " + employee.getAllowance());
        System.out.println("Total Salary: " + employee.calculateSalary());
    }
}


