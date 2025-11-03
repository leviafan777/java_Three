package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Проверка создания сотрудников ===");

        try {
            Employee e1 = new Employee("Лев Вова", "менеджер", -5000);
        } catch (OkladException e) {
            System.err.println(e.getMessage());
        }

        try {
            StatEmployee e2 = new StatEmployee("Коржун Кирилл", "программист", 60000, -3000);
            System.out.println(e2);
            System.out.println("Зарплата: " + e2.rasschitatZarplatu());
        } catch (OkladException e) {
            System.out.println("Ошибка при создании штатного сотрудника: " + e.getMessage());
        }
        finally {
            System.out.println("Сообщение выводится не в зависимости от результата");
        }

        try {
            EmployeeOfSalary e3 = new EmployeeOfSalary("Губка Миша", "дизайнер", -5);
            System.out.println(e3);
            System.out.println("Зарплата: " + e3.rasschitatZarplatu());
        } catch (OkladException e) {
            System.out.println("Ошибка при создании контрактного сотрудника: " + e.getMessage());
        }

    }
}