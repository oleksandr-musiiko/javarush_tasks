package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 0) {
            number *= 2;
            System.out.println(number);
        }
        else
        if (number < 0) {
            number++;
            System.out.println(number);
        }
        else System.out.println(0);
    }

}