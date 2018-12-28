package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int n = Integer.parseInt(reader.readLine());
        int i = 0;
        while (i < n)
        {
            int number = Integer.parseInt(reader.readLine());
            if (number > maximum) maximum = number;
            i++;
        }
        System.out.println(maximum);

        //напишите тут ваш код

        
    }
}
