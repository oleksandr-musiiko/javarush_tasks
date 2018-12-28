package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String result = "";
        result += Character.toUpperCase(s.charAt(0));

        for (int i = 1; i < s.length(); i++)
        {
            char c = s.charAt(i);
            char ex = s.charAt(i - 1);
            if (ex == ' ') result += Character.toUpperCase(c);
            else result += c;
        }
        s = result;
        System.out.println(s);
        //напишите тут ваш код
    }
}
