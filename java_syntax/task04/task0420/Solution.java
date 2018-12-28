package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 3; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int out = array.length - 1; out >= 0; out--)
        {
            for (int i = 0; i < out; i++)
            {
                if (array[i] < array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int element:
             array) {
            System.out.println(element);
        }
    }
}
