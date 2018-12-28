package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(10);
        int maxString = 0;
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        for (int i = 0; i < list.size(); i++)
        {
            if (maxString <= list.get(i).length())
            {
                maxString = list.get(i).length();
                continue;
            }
            else
            {
                System.out.println(i);
                break;
            }
        }


    }
}

