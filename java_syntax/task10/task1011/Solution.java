package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        for (int i = 0; i < 40; i++)
        {
            System.out.println(s);
            //String temp = s;
            String result = "";

            for (int c = 1; c < s.length(); c++)
            {
                result += s.charAt(c);
            }
            s = result;
        }

        //напишите тут ваш код
    }

}

