package com.JavaPractice;

public class WrapperExample {

    public static void main(String[] args) {

        String a = "100";

        int b = Integer.parseInt(a);

        Integer c = b;

        System.out.println("before : " + a);
        System.out.println("after: " + b);
        System.out.println("output: " + c);

    }
}