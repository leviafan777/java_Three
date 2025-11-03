package com.example.task2;

public class AsianCountry extends Country {
    private String language;

    public AsianCountry(String name, int population, String language) {
        super(name, population);
        this.language = language;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Основной язык: " + language);
    }
}
