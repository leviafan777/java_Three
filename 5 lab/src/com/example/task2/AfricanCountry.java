package com.example.task2;

public class AfricanCountry extends Country {
    private String climate;
    public AfricanCountry(String name, int population, String climate) {
        super(name, population);
        this.climate = climate;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Климат: " + climate);
    }
}
