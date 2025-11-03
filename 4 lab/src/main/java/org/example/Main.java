package org.example;
import org.example.Classes.Tester;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, Вова!");

        Tester tester1 = new Tester("Левый");
        Tester tester2 = new Tester("Губин", "Михаил");
        Tester tester3 = new Tester("Корженевский", "Кирилл", 3, "B2", 1500.0);

        tester1.showInfo();
        tester2.showInfo("Информация о тестировщике:");
        tester3.showInfo("Данные:", true);

        Tester.printGeneralInfo();
    }
}

