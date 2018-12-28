package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Dog implements Movable, Eat
    {
        public void move ()
        {
            System.out.println("Dog run");
        }

        public void eat ()
        {
            System.out.println("Dog eat");
        }
    }

    public class Cat implements Movable, Eat, Eatable
    {
        public void move()
        {
            System.out.println("Cat run");
        }

        public void eat ()
        {
            System.out.println("Cat eat");
        }

        public void eaten ()
        {
            System.out.println("Cat eaten");
        }

    }

    public class Mouse implements Movable, Eatable
    {
        public void move()
        {
            System.out.println("Mouse run");
        }

        public void eaten()
        {
            System.out.println("Mouse eaten");
        }
    }
}