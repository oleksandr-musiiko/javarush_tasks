package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        printSum(5);
        
    }
    
    public static void printSum(int number) {
        for (int i = 1; i <= number; i++) System.out.println(sum(i));
        /*for(int i = 2; i <= number; i++){
            for (int k = 1; k <= i; k++){
                System.out.print(k);
                if (k < i) System.out.print("+"); 
                else System.out.print("=");
            }
            System.out.print(sum(i));
            System.out.println();
            
        }
        */
    }
    
    public static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) sum += i;
        return sum;
    }
    
}
