package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());
        System.out.println(max(number1, number2, number3, number4));
    }

    public static int max(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    public static int max(int number1, int number2, int number3) {
        return max(number1, number2) > number3 ? max(number1, number2) : number3;
    }

    public static int max(int number1, int number2, int number3, int number4) {
        int maxOfThree = max(number1, number2, number3);
        return maxOfThree > number4 ? maxOfThree : number4;
    }
}
