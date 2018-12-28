package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<String> arrayList = new ArrayList<String>(n);
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++)
        {
            arrayList.add(reader.readLine());
        }
        for (int i = 0; i < m; i++)
        {
            String temp = arrayList.get(0);
            arrayList.remove(0);
            arrayList.add(arrayList.size(), temp);
        }
        //напишите тут ваш код
        for (String element : arrayList)
        {
            System.out.println(element);
        }
    }
}
