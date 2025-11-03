package org.example.three;

public class EmployeeSecond {
    public int id;
    public String fullName;
    double salary;
    boolean isHourly;

    public EmployeeSecond(int id, String fullName, double salary, boolean isHourly) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
        this.isHourly = isHourly;
    }

    public double getAverageSalary() {
        if (isHourly)
            return 20.8 * 8 * salary;
        else
            return salary;
    }
}
