package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int countNegative = 0;
        int countPositive = 0;
        if (number1 < 0) countNegative++;
        else if (number1 > 0) countPositive++;
        if (number2 < 0) countNegative++;
        else  if (number2 > 0) countPositive++;
        if (number3 < 0) countNegative++;
        else  if (number3 > 0) countPositive++;
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
