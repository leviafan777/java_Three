package org.example;

abstract class Weather {
    int age ;
    abstract void forecast();

    public Weather( int age){
        this.age=age;
    }
    abstract void method();
}
