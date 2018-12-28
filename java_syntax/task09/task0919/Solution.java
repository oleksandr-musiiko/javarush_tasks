package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/


public class Solution {

    public static void main(String[] args)
    {
        try {
            divisionByZero();
        }
        catch (ArithmeticException e){

            e.printStackTrace();
        }
    }

    public static void divisionByZero()
    {
        int n = 5 / 0;
        System.out.println(n);

    }

   /* public static void printStackTrace(Exception e)
    {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = stackTraceElements.length - 2; i >= 0; i--)
        {
            System.out.println(stackTraceElements[i].getMethodName());
        }
    } */
}
