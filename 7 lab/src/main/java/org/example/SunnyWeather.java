package org.example;

public class SunnyWeather extends Weather {
    public SunnyWeather(int age) {
        super(age);
    }

    @Override
    void forecast() {
        System.out.println("Сегодня солнечно! Отличный день для прогулки ");
    }

    @Override
    void method() {
        System.out.println("Это абстрактный метод");
    }
}
