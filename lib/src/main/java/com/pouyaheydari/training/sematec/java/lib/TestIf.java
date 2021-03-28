package com.pouyaheydari.training.sematec.java.lib;

public class TestIf {

    public static void main(String[] args) {
        int age = 35;
        boolean isMale = false;
        boolean isVIP = true;

        if (age >= 90) {
            System.out.println("Old");
        } else if (age >= 50) {
            System.out.println("Mid age");
        } else if (age >= 20) {
            System.out.println("Young");
        } else if (age >= 10) {
            System.out.println("Teen");
        } else {
            System.out.println("kid");
        }

        if (age >= 18 && isMale == true) {// and
            System.out.println("Mr.");
        }

        if (age >= 18 && isMale == false) {
            System.out.println("Ms.");
        }

        if (isMale == false || isVIP == true) { // or
            System.out.println("Grant entrance permission!");
        }
    }
}
