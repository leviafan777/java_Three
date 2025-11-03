package org.example.first;

public class Technician extends Employee {
    private String specialization;
    public Technician(String name,String specialization) {
        super(name);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }
}
