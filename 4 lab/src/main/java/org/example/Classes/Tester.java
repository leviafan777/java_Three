package org.example.Classes;

public class Tester {
    String name;
    String surname;
    int experienceInYears;
    String englishLevel;
    double salary;

    public Tester(String name) {
        this(name, "Неизвестно");
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void showInfo() {
        System.out.printf("Tester: %s %s, опыт %d лет, английский %s, зарплата %.2f%n", name, surname, experienceInYears, englishLevel, salary);
    }

    public void showInfo(String prefix) {
        System.out.println(prefix);
        showInfo();
    }

    public void showInfo(String prefix, boolean uppercase) {
        if (uppercase) {
            System.out.println(prefix.toUpperCase());
        } else {
            System.out.println(prefix);
        }
        showInfo();
    }

    public static void printGeneralInfo() {
        System.out.println("Все тестировщики проверяют качество ПО.");
    }
}
