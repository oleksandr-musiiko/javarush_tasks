package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

import javax.print.FlavorException;

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Eat, Move{
        public void eat()
        {
            System.out.println("I eat");


        }
        public void move()
        {
            System.out.println("I move");
        }
    }

    public class Duck implements Fly, Move, Eat{
        public void fly()
        {
            System.out.println("I fly");
        }

        public void move()
        {
            System.out.println("I move");
        }

        public void eat()
        {
            System.out.println("I eat");
        }

    }

    public class Car implements Move{
        public void move()
        {
            System.out.println("The car move");
        }

    }

    public class Airplane implements Fly, Move{
        public void fly()
        {
            System.out.println("The airplane fly");
        }

        public void move()
        {
            System.out.println("The airplane move");
        }
    }
}
