package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface Fly
    {
        void fly();
    }

    public interface Climb
    {
        void climb();
    }

    public interface Run
    {
        void run();
    }


    public class Cat implements Climb, Run{
        public void run()
        {
            System.out.println("Cat run");
        }

        public void climb()
        {
            System.out.println("Cat climb");
        }

    }

    public class Dog implements Run{
        public void run()
        {
            System.out.println("Dog run");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run{
        public void fly()
        {
            System.out.println("Duck fly");
        }

        public void run()
        {
            System.out.println("Duck run");
        }

    }
}
