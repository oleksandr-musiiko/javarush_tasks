package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 1; i < 11; i++) {
            for (int k = 1; k < 11; k++) {
                System.out.print(i * k);
                if (k < 10) System.out.print(" ");
                
            }
            System.out.println();
        }
    }
    
    
}
