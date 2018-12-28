package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        int maxLine = 1;
        int temp = 1;
        for (int i = 1; i < arrayList.size(); i++)
        {
                if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                    temp++;
                }
                else
                {
                    temp = 1;
                }
                if (maxLine < temp) maxLine = temp;
        }
        System.out.println(maxLine);
    }
}