package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(fileInputStream));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (reader1.ready())
        {
            String s = reader1.readLine();

            int number = Integer.parseInt(s);
            if (number % 2 == 0) arrayList.add(number);
            //k++;
        }
        reader.close();
        fileInputStream.close();
        reader1.close();
        for (int out = arrayList.size() - 1; out >= 1; out--)
        {
            for (int i = 0; i < out; i++)
            {
                if (arrayList.get(i) > arrayList.get(i + 1))
                {
                    int temp1 = arrayList.get(i);
                    int temp2 = arrayList.get(i + 1);
                    arrayList.remove(i);
                    arrayList.add(i, temp2);
                    arrayList.remove(i + 1);
                    arrayList.add(i + 1, temp1);

                }
            }
        }
        for (int element:
             arrayList) {
            System.out.println(element);
        }
    }
}
