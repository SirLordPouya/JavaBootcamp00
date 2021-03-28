package com.pouyaheydari.training.sematec.java.lib;

public class TestSwitch {

    public static void main(String[] args) {
        int input = 10;

        switch (input) {
            case 1:
                System.out.println("Setting");
                break;
            case 2:
                System.out.println("Profile");
                break;
            case 3:
                System.out.println("Game");
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid input!");
        }


    }
}
