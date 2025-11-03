package org.example;

public class Otdel {
    private String name;
    private int employeeCount;

    public Otdel(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
}
