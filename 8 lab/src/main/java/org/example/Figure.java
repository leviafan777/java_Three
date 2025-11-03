package org.example;

abstract class Figure {
    private String name;
    protected int countStorona;

    public Figure(String name, int count) {
        this.name = name;
        this.countStorona = count;
    }

    public String getName() {
        return this.name;
    }

    public void showInfo() {
        System.out.println(" Имя" + this.name);
    }

    abstract int perimetr();
}