package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private String color;
    private int weight;
    private String address;
    final int WEIGHTSTANDART = 3;
    final String COLORSTANDART = "Black";
    final int AGESTANDART = 3;

    public Cat(String name)
    {
        this.name = name;
        this.age = 3;
        this.color = COLORSTANDART;
        this.weight = WEIGHTSTANDART;

    }

    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = COLORSTANDART;
    }

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.color = COLORSTANDART;
        this.weight = WEIGHTSTANDART;
    }

    public Cat(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.age = AGESTANDART;

    }

    public  Cat(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = AGESTANDART;
    }

    public static void main(String[] args) {

    }
}
