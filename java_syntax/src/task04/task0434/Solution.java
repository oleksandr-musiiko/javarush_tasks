package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1;
        while (i < 11) {
            int k = 1;
            while(k < 11)
            {
                System.out.print(k * i);
                if (k < 10) System.out.print(" ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
