package com.javarush.task.task04.task0425;

/* 
Цель установлена!
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        if ((number1 > 0) & (number2 > 0)) System.out.println(1);
        if ((number1 < 0) & (number2 > 0)) System.out.println(2);
        if ((number1 < 0) & (number2 < 0)) System.out.println(3);
        if ((number1 > 0) & (number2 < 0)) System.out.println(4);
    }
}
