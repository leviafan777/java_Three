package org.example;

class SunnyWeather implements Weather{
    @Override
    public void forecast() {
        System.out.println("Сегодня солнечно.");
    }
    public void speak(){
        System.out.println("Я умею говорить");
    }
    public void hello(){
        System.out.println("Привет, я Николя");
    }
}