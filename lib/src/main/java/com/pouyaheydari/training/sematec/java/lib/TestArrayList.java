package com.pouyaheydari.training.sematec.java.lib;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Pouya"); //0
        names.add("Ali"); // 1
        names.add("Maryam"); //2
        names.add("Mojtaba");
        names.add("Neda");
        names.add("Saman");

//        String userName = names.get(6);
//        System.out.println(userName);


        for (int i = 0; i < names.size(); i = i + 1) {
            String userName = names.get(i);
            System.out.println(userName);
        }
    }
}
