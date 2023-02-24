//1) Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<String, Integer> phones = new HashMap<>();
                while(true) {
            String str = iScanner.nextLine();
            if (str.equals("Q")) {
                iScanner.close();
                break;
                }
            else if (str.equals("Add")) addPhone(phones);
            else if (str.equals("Print")) printPhones();
            else System.out.println("Неизвестная команда. Повторите ввод.");
        }
        System.out.println("Thanks!");
    }

    public static void addPhone(Map<String, Integer> phones) {
        Scanner iScanner = new Scanner(System.in);
//        String str = iScanner.nextLine();
//        String[] strArray = iScanner.nextLine().split("-");
        System.out.println("Введите имя-телефон");
        String[] strArray = "-".split(iScanner.nextLine());
        String name = strArray[0];
        Integer phone = Integer.parseInt(strArray[1]);
//        phones<>

        phones.cont
        for (var el : phones.entrySet()) {
            if (el.getValue().equals("Иванов")) {
                System.out.print(el.getKey() + ": " + el.getValue() + "\n");
            }
        }
    }

        //            if (name.equals("print")) {
//        System.out.println(names.get(index));
//        names.remove(index);
//    }
//            else if (index > names.size()) {
//        for (int i = names.size(); i < index; i++){
//            names.add(i, null);
//        }
//        names.add(index, name);
//    }
//            else names.add(index, name);


    public static void printPhones() {}

}