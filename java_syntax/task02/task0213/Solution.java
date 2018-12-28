package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Woman woman1 = new Woman();
        Cat cat = new Cat();
        cat.owner = woman1;
        Dog dog = new Dog();
        dog.owner = woman1;
        Fish fish = new Fish();
        fish.owner = woman1;
        
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
