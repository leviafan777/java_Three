package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weather sunny = new SunnyWeather(5);
        Weather rainy = new RainyWeather(5);

        sunny.forecast();
        rainy.forecast();
    }
}