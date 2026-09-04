package com.JavaPractice;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        String a = "10";
        String b = "20";

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(x);
        numbers.add(y);

        System.out.println(numbers);
    }
}
