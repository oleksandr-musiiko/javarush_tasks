package com.javarush.task.task12.task1219;

/* 
Создаем человека
*/

import javax.print.FlavorException;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public class Human implements  Run, Swim{



        public void swim()
        {
            System.out.println("Human swim");
        }

        public void run()
        {
            System.out.println("Human run");
        }

    }

    public class Duck implements Fly, Run, Swim{

        public void fly()
        {
            System.out.println("Duck fly");
        }

        public void run()
        {
            System.out.println("Duck run");
        }

        public void swim()
        {
            System.out.println("Duck swim");
        }
    }

    public class Penguin implements Run, Swim {

        public void run()
        {
            System.out.println("Penguin run");
        }

        public void swim()
        {
            System.out.println("Penguin swim");
        }
    }

    public class Airplane implements Fly, Run{

        public void fly()
        {
            System.out.println("Airplane fly");
        }

        public void run()
        {
            System.out.println("Airplane run");
        }
    }
}
