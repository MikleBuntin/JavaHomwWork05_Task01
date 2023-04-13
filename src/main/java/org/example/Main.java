//1) Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        HashMap<Person, Phone> phoneBook = new HashMap<>();

        while(true) {
            System.out.println("Доступные команды: Add; Print; Q");
            String str = iScanner.nextLine();
            if (str.equals("Q")) {
                iScanner.close();
                break;
            }
            else if (str.equals("Add")) addPhone(phoneBook);
            else if (str.equals("Print")) printPhones(phoneBook);
            else System.out.println("Неизвестная команда. Повторите ввод.");
        }
        System.out.println("Thanks!");
    }

    public static void addPhone(HashMap<Person, Phone> phoneBook) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите Имя: ");
        String name = iScanner.nextLine();
        System.out.println("Введите Фамилию: ");
        String surName = iScanner.nextLine();
        Person person = new Person(name, surName);
        Phone phone = new Phone();
        while(true) {
            System.out.println("Введите телефон: ");
            String str = iScanner.nextLine();
            Integer tel = null;
            if (str.equals("Q")) {
                iScanner.close();
                break;
            }
            tel = Integer.valueOf(str);
            phone.add(tel);
            System.out.println("Q - сохранить и выйти");
        }

        if (phoneBook.containsKey(person))
            System.out.println("Такое имя существует.");
        else {
            phoneBook.put(person,phone);
            System.out.println("Телефон сохранён.");
        }

    }
    public static void printPhones(HashMap<Person, Phone> phoneBook) {
        for (Person person : phoneBook.keySet()) {
            System.out.print("Name: " + person.getName() + " " + person.getSurname() + "; ");
            phoneBook.get(person).print();

        }
    }


}