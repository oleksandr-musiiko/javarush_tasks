package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        double coefficentCat = this.weight * this.strength / this.age;
        double coefficentAnotherCat = anotherCat.weight * anotherCat.strength / anotherCat.age;
        return coefficentCat < coefficentAnotherCat ? false : true;
    }

    public static void main(String[] args) {

    }
}
