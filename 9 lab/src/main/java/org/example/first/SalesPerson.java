package org.example.first;

public class SalesPerson extends Employee {
    private int salary;

    public SalesPerson(String name,int salary) {
        super(name);
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

}
