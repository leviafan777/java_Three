package org.example;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задание:");
        System.out.println("1 - Информация о себе и вывод данных файла");
        System.out.println("2 - Средняя температура");
        System.out.println("3 - Записать числа в файл");
        System.out.print("Выбери: ");
        try {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                default:
                    System.out.println("Такого пункта нет.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Введите число 1–3.");
        }
    }


    private static void task1() {
        String fileName = "vova.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Имя: Вова\n");
            writer.write("Фамилия: Левый\n");
            writer.write("Возраст: 19\n");
            writer.write("Группа: Т-318\n");
            writer.write("Курс: 4\n");
            System.out.println("Файл успешно создан.");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
            return;
        }

        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }


    private static void task2() {
        String fileName = "temperatura.txt";
        Scanner input = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 15 температур (через Enter):");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Температура " + i + ": ");
                double t = input.nextDouble();
                writer.write(t + "\n");
            }
            System.out.println("Температуры записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        } catch (Exception e) {
            System.out.println("Ошибка ввода данных!");
            return;
        }

        double sum = 0;
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    double temp = Double.parseDouble(line);
                    sum += temp;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: найдено некорректное значение в файле!");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден!");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.print("Средняя температура: \n" + average);
        } else {
            System.out.println("Нет данных для вычисления средней!");
        }
    }



    private static void task3() {
        String fileName = "numbers.txt";
        Random rand = new Random();

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Генерация 10 случайных чисел:");
            for (int i = 1; i <= 10; i++) {
                int num = rand.nextInt(90) - 30;
                writer.write(num + "\n");
                System.out.println("Число " + i + ": " + num);
            }
            System.out.println("Числа записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
            return;
        }

        int sum = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int n = Integer.parseInt(line);
                    sum += n;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: найдено нечисловое значение в файле!");
                }
            }
            System.out.println("Сумма всех чисел: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}