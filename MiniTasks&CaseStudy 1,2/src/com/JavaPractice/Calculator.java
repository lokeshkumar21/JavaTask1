package com.JavaPractice;

public class Calculator {

    public void add(int a,int b){
        System.out.println("Addition operation:");
        System.out.println(a+b);
    }

    public void sub(int a,int b){
        System.out.println("Subtraction operation:");
        System.out.println(a+b);
    }

    public void mul(int a,int b){
        System.out.println("Multiplication operation:");
        System.out.println(a+b);
    }

    public void div(int a,int b){
        System.out.println("Division operation:");
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(2,3);
        calculator.sub(5,4);
        calculator.mul(2,3);
        calculator.div(10,2);
    }
}
