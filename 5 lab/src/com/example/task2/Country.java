package com.example.task2;

public class Country {
    protected String name;
    protected int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void displayInfo() {
        System.out.println("Страна: " + name + ", Население: " + population);
    }
}

