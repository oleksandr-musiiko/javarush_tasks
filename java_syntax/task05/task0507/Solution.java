package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int i = 0;
        while (true)
        {
            int number = Integer.parseInt(reader.readLine());
            if (number == -1) break;
            else sum += number;
            i++;
        }
        double average = sum / i;
        System.out.print(average);
    }
}

