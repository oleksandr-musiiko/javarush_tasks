package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.equals("exit")) {
                arrayList.add(s);
                break;
            }
            arrayList.add(s);
        }
        reader.close();
        FileOutputStream outputStream = new FileOutputStream(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        for (String element:
             arrayList) {
            bufferedWriter.write(element);
            bufferedWriter.newLine();

        }
        outputStream.close();
        bufferedWriter.close();
    }
}
