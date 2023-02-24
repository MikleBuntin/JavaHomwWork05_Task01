//1) Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<Integer, String> phones = new HashMap<>();
        while(true) {
            System.out.println("Доступные команды: Add; Print; Q");
            String str = iScanner.nextLine();
            if (str.equals("Q")) {
                iScanner.close();
                break;
            }
            else if (str.equals("Add")) addPhone(phones);
            else if (str.equals("Print")) printPhones(phones);
            else System.out.println("Неизвестная команда. Повторите ввод.");
        }
        System.out.println("Thanks!");
    }

    public static void addPhone(Map<Integer, String> phones) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите телефон-Имя");
//        String[] strArray = "-".split(iScanner.nextLine());
        String str = iScanner.nextLine();
//        System.out.println("str: " + str);
        String[] strArray = str.split("-");
        Integer phone = Integer.parseInt(strArray[0]);
        String name = strArray[1];

        if (phones.containsKey(phone))
            System.out.println("Такой телефон существует.");
        else {
            phones.put(phone,name);
            System.out.println("Телефон сохранён.");
        }

    }
    public static void printPhones(Map<Integer, String> phones) {
        for (Integer phone : phones.keySet()) {
            System.out.print("Phone: " + phone + ", Name: " + phones.get(phone));
        }
    }


}