package org.example;

public class RainyWeather implements Weather {
    @Override
    public void forecast() {
        System.out.println("Сегодня дождь");
    }
}