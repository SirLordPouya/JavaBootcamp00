package com.pouyaheydari.training.sematec.java.lib;

import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        int birthYear = s.nextInt();

        String name = s.next();

        int age = 2021 - birthYear;
        System.out.println("Your age is: " + age);
    }
}
