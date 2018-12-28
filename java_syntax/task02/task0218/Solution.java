package com.javarush.task.task02.task0218;

/* 
Повторенье-мать
*/
public class Solution {
    public static void print3(String s) {
        //напишите тут ваш код
        int i = 3;
        while(i>0)
        {
            System.out.println(s);
            i--;
        }

    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}