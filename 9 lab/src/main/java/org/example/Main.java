package org.example;

import org.example.first.Employee;
import org.example.first.SalesPerson;
import org.example.first.Technician;
import org.example.second.Student;
import org.example.three.EmployeeSecond;
import org.example.three.Report;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите задание 1-3 :");
        int vibor = sc.nextInt();
        switch (vibor) {
            case 1:

                Map<Integer, Employee> employees = new HashMap<>();

                employees.put(1, new SalesPerson("Миша", 120));
                employees.put(2, new Technician("Кирилл", "Программирование"));
                employees.put(3, new SalesPerson("Вова", 200));

                System.out.println("ID всех сотрудников:");
                for (Integer id : employees.keySet()) {
                    System.out.println(id );
                }
                System.out.println(employees);

                break;
            case 2:
                List<Student> students = new ArrayList<>();
                students.add(new Student("Иван", "A1", 1, Arrays.asList(4, 5, 3)));
                students.add(new Student("Петр", "A1", 1, Arrays.asList(2, 2, 3)));
                students.add(new Student("Анна", "B2", 2, Arrays.asList(5, 4, 5)));
                students.add(new Student("Мария", "B2", 2, Arrays.asList(3, 3, 3)));
                students.add(new Student("Сергей", "C3", 3, Arrays.asList(2, 2, 2)));
                processStudents(students);

                System.out.println("\nСтуденты 2 курса:");
                printStudents(students, 2);


                System.out.println("\nСтуденты 3 курса:");
                printStudents(students, 3);
                break;
            case 3:
                EmployeeSecond[] employees1 = {
                        new EmployeeSecond(1, "Иванов", 50000, true),
                        new EmployeeSecond(2, "Петров", 400, true),
                        new EmployeeSecond(3, "Сидоров", 60000, false),
                        new EmployeeSecond(4, "Алексеев", 50000, true),
                        new EmployeeSecond(5, "Морозов", 70000, false),
                        new EmployeeSecond(6, "Белов", 500030, true)
                };

                for (int i = 0; i < employees1.length - 1; i++) {
                    for (int j = 0; j < employees1.length - i - 1; j++) {
                        double salary1 = employees1[j].getAverageSalary();
                        double salary2 = employees1[j + 1].getAverageSalary();

                        if (salary1 < salary2 || (salary1 == salary2 && employees1[j].fullName.compareTo(employees1[j + 1].fullName) < 0)) {

                            EmployeeSecond temp = employees1[j];
                            employees1[j] = employees1[j + 1];
                            employees1[j + 1] = temp;
                        }
                    }
                }

                Report.generateReport(employees1);

                System.out.println("\nПервые 5 имён:");
                for (int i = 0; i < 5 && i < employees1.length; i++) {
                    System.out.println(employees1[i].fullName);
                }

                System.out.println("\nПоследние 3 ID:");
                for (int i = employees1.length - 3; i < employees1.length; i++) {
                    System.out.println(employees1[i].id);
                }
                break;
            default:
                System.out.println("Неправильный выбор");
                break;

        }

    }

    public static void processStudents(List<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3);
        for (Student s : students) {
            s.setCourse(s.getCourse() + 1);
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}