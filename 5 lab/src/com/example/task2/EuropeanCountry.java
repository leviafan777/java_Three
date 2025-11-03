package com.example.task2;


public class EuropeanCountry extends Country {
    private String union;

    public EuropeanCountry(String name, int population, String union) {
        super(name, population);
        this.union = union;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Союз: " + union);
    }
}

