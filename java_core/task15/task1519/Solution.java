package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.ParseException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s = reader.readLine();
            if (s.equals("exit")) break;
            if (s.contains("."))
            {
                try
                {
                    print(Double.parseDouble(s));
                }
                catch (Exception e)
                {
                    print(s); continue;
                }
            }
            else {
                try {
                    Integer number = Integer.parseInt(s);
                    if ((number > 0) && (number < 128)) { print(Short.parseShort(s)); continue; }
                    else if ((number <= 0) || (number >= 128)){ print(number); continue; }
                } catch (Exception e) {
                    print(s);
                    continue;
                }
            }
            



        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
