package org.example;

public class EmployeeOfSalary extends Employee {
    public EmployeeOfSalary(String fio, String dolzhnost, double oklad) throws OkladException {
        super(fio, dolzhnost, oklad);
    }

    @Override
    public double rasschitatZarplatu () {
        try {
            return getOklad();
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты: " + e.getMessage());
            return 0;
        }
    }
}
