package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>(5);
        int minString = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++)
        {
            arrayList.add(reader.readLine());
            if (arrayList.get(i).length() < minString) minString = arrayList.get(i).length();
        }
        for (int i = 0; i < arrayList.size(); i++)
        {
            if(arrayList.get(i).length() == minString) System.out.println(arrayList.get(i));
        }

    }
}
