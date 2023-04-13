package org.example;

import java.util.ArrayList;

public class Phone {
    private ArrayList<Integer> phones;

    public void add(Integer phone) {
        phones.add(phone);
    }

    public void print() {
        System.out.print("phones:");
        for (Integer tel : phones) {
            System.out.print(tel + ";");
        }
    }
}
