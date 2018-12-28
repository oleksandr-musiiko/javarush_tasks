package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Michael", 33, "Toronto");
        Man man2 = new Man("Pavel", 22, "Monreal");
        Woman woman1 = new Woman("Asya", 30, "Kyiv");
        Woman woman2 = new Woman("Irina", 30, "Lviv");
        man1.toConsole();
        man2.toConsole();
        woman1.toConsole();
        woman2.toConsole();
    }

    //напишите тут ваш код
    public static class Man
    {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;

        }

        public void toConsole()
        {
            System.out.println(this.name + " " + this.age + " " + this.address);
        }

    }

    public static class Woman
    {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public void toConsole()
        {
            System.out.println(this.name + " " + this.age + " " + this.address);
        }


    }
}
