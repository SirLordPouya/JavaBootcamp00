package com.pouyaheydari.training.sematec.java.lib;

//Pascal
public class MyClass {


    //  / slash
    //  \ back slash
    //  . dot
    //  @ at sign
    //  $ dollar sign
    //  # Sharp, number sign
    //  & ampersand
    //  ()
    //  - dash
    //  _ underline, underscore
    //  , comma
    //  : colon
    //  ; semi-colon
    //  [] brace
    //  {} curly brace
    //  ' single quotation
    //  " double quotation
    //  | pipe line
    //  ~ tilde


    int age = 18;
    int height = 185;
    double pi = 3.14;
    double d = 65464.6546;
    boolean isMale = true; // flag
    boolean isAdult = false;
    String name = "Pouya";
    String family = "Heydari";
    float f = 65465.25656f;
    byte b = 127;
    short s = 128;
    long l = 2147483648L;
    char p = 'P';
    char lowerP = 'p';


    public static void main(String[] args) {
        System.out.println("Hello World!");
        int age = calculateAge(1990);
        double sumResult = sum(2.5, 9.1);
        System.out.println(age);
        System.out.println(sumResult);
        printWelcome();

    }

    public static int calculateAge(int birthYear) {
        int result = 2021 - birthYear; // 31
        return result; // return 31
    }

    public static double sum(double first, double second) {
        double result = first + second;
        return result;
    }

    public double getPi() {
        double pi = 3.14;
        return pi;
    }

    public static void printWelcome() {
        System.out.println("Welcome!");
    }
}