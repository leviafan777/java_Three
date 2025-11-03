package org.example.three;

public class Report {
    public static void generateReport(EmployeeSecond[] employees) {
        System.out.printf("%-5s %-15s %10s\n", "ID", "Full Name", "Salary");
        System.out.println("----------------------------------------");
        for (EmployeeSecond e : employees) {
            System.out.printf("%-5d %-15s %10.2f\n", e.id, e.fullName, e.getAverageSalary());
        }
    }
}
