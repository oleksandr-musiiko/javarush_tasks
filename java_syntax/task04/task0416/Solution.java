package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        double tTemp = t % 5;
        if (tTemp < 3) System.out.println("зелёный");
        else {
            if (tTemp < 4) System.out.println("желтый");
            else if (tTemp < 5) System.out.println("красный");
        }
    }
}