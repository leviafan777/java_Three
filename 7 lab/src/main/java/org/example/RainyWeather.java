package org.example;

class RainyWeather extends Weather implements Logica {
    public RainyWeather(int age) {
        super(age);
    }

    @Override
    void forecast() {
        System.out.println("Сегодня дождь. Не забудьте зонт ");
    }
    @Override
    void method() {
        System.out.println("Это абстрактный метод");
    }

    @Override
    public void hello() {
        System.out.println("Привет, я Николя");
    }

    @Override
    public void speak() {
        System.out.println("Я умею говорить");
    }
}
