package com.pouyaheydari.training.sematec.java.lib;

public class TestChild extends TestParent {


    public void greetings() {
        System.out.println("Hello ");
        printFullName();
        printName();
    }

    @Override
    public void printName() {
        if (isMale == true) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Ms. " + name);
        }
    }
}
