package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if ((1 <= number) && (number <= 999)) {
            System.out.println(isNumberEven(number) + " " + countOfNumber(number) + " число");
        }

    }

    public static String countOfNumber(int number)
    {
       int count = 0;
       while (number >= 1)
       {
           number /= 10;
           count++;
       }
       switch (count)
       {
           case 1: return "однозначное";
           case 2: return "двузначное";
           case 3: return "трехзначное";
           default: return "";
       }
    }



    public static String isNumberEven(int number)
    {
        if (number % 2 == 0) return "четное";
        else return "нечетное";
    }

}
