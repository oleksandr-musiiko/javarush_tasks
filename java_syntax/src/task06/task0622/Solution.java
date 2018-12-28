package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int out = array.length - 1; out >= 1; out--)
        {
            for(int i = 0; i < out; i++)
            {
                if (array[i] > array[i + 1])
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
        //напишите тут ваш код
    }
}
