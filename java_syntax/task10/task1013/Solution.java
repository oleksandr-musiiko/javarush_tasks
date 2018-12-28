package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private boolean sex;
        private int age;
        private Human mother;
        private String name;
        private double salary;
        private char mark;

        public Human(boolean sex, int age, Human mother)
        {
            this.sex = sex;
            this.age = age;
            this.mother = mother;
        }

        public Human(boolean sex)
        {
            this.sex = sex;
        }

        public Human(boolean sex, int age)
        {
            this.sex = sex;
            this.age = age;
        }

        public Human (boolean sex, Human mother)
        {
            this.sex = sex;
            this.mother = mother;
        }

        public Human (Human mother, int age, String name, boolean sex)
        {
            this.mother = mother;
            this.age = age;
            this.name = name;
            this.sex = sex;

        }

        public  Human (Human mother, int age, boolean sex)
        {
            this.mother = mother;
            this.age = age;
            this.sex = sex;
        }

        public Human (Human mother, String name, char mark)
        {
            this.mother = mother;
            this.name = name;
            this.mark = mark;
        }

        public Human (Human mother, char mark, double salary)
        {
            this.mother = mother;
            this.mark = mark;
            this.salary = salary;
        }

        public Human (int age, char mark, Human mother, double salary, String name, boolean sex)
        {
            this.age = age;
            this.mark = mark;
            this.mother = mother;
            this.salary = salary;
            this.name = name;
            this.sex = sex;
        }

        public  Human (int age, char mark, Human mother, double salary, String name)
        {
            this.age = age;
            this.mark = mark;
            this.mother = mother;
            this.salary = salary;
            this.name = name;
        }
    }
}
