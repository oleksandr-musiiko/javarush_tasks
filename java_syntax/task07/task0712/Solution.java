package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>(10);
        int maxString = 0;
        int minString = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++)
        {
            arrayList.add(reader.readLine());
            int length = arrayList.get(i).length();
            if (minString > length) minString = length;
            if (maxString < length) maxString = length;
        }

        for (int i = 0; i < arrayList.size(); i++)
        {
            int length = arrayList.get(i).length();
            if (length == minString) {
                System.out.println(arrayList.get(i));
                break;
            }
            if (length == maxString) {
                System.out.println(arrayList.get(i));
                break;
            }

        }
    }
}
