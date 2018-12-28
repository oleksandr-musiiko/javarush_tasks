package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String number1String = reader.readLine();
        int number1 = Integer.parseInt(number1String);
        String number2String = reader.readLine();
        int number2 = Integer.parseInt(number2String);
        System.out.println(name + " получает "  + number1 + " через " + number2 + " лет.");
    }
}
