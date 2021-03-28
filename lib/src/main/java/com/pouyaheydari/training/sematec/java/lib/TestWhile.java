package com.pouyaheydari.training.sematec.java.lib;

public class TestWhile {

    public static void main(String[] args) {
        int coin = 0;

        do {
            System.out.println("Take a candy");
            coin = coin - 1;
        } while (coin > 0);
    }
}
