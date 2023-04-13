package org.example;

import java.util.ArrayList;

public class Phone {
    private ArrayList<String> phones = new ArrayList<>();

    public void add(String phone) {
        phones.add(phone);
    }

    public void print() {
        System.out.println("phones:");
        for (String tel : phones) {
            System.out.println(tel + ";");
        }
    }
}
