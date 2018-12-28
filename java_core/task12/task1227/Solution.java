package com.javarush.task.task12.task1227;

/* 
Fly, Run, Swim для классов Duck, Penguin, Toad
*/

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

    public class Duck implements Fly, Run, Swim
    {
        public void fly()
        {
            System.out.println("Duck fly");
        }

        public void run()
        {
            System.out.println("Duck fly");
        }

        public void swim()
        {
            System.out.println("Duck swim");
        }
    }

    public class Penguin implements Run, Swim
    {
        public void swim()
        {
            System.out.println("Penguin swim");
        }

        public void run()
        {
            System.out.println("Penguin run");
        }

    }

    public class Toad implements Swim{
        public void swim()
        {
            System.out.println("Toad swim");
        }
    }
}
