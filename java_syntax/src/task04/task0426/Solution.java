package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if ((n > 0) && (n % 2 == 0)) System.out.print("положительное четное число");
        if ((n > 0) && (n % 2 != 0)) System.out.print("положительное нечетное число");
        if ((n < 0) && (n % 2 == 0)) System.out.print("отрицательное четное число");
        if ((n < 0) && (n % 2 != 0)) System.out.print("отрицательное нечетное число");
        if (n == 0) System.out.print("ноль");
    }
}
