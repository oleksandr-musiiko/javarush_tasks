package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int sumOfEvenHouses = 0;
        int sumOfOddHouses = 0;
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
            if(i % 2 == 0) sumOfEvenHouses += array[i];
            else sumOfOddHouses += array[i];
        }
        System.out.println(sumOfEvenHouses < sumOfOddHouses ? "В домах с нечетными номерами проживает больше жителей." : "В домах с четными номерами проживает больше жителей.");
    }
}
