package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String firstFileName = "";
        String secondFileName = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (reader.ready()) {
            firstFileName = reader.readLine();
        }
        if (reader.ready()) {
            secondFileName = reader.readLine();
        }
        reader.close();
        FileInputStream file1InputStream = new FileInputStream(firstFileName);
        FileInputStream file2InputStream = new FileInputStream(secondFileName);
        reader = new BufferedReader(new InputStreamReader(file1InputStream));
        while (reader.ready()) {
            allLines.add(reader.readLine());
        }
        reader.close();
        reader = new BufferedReader(new InputStreamReader(file2InputStream));
        while (reader.ready()) {
            forRemoveLines.add(reader.readLine());
        }
        reader.close();
        new Solution().joinData();
    }

    public synchronized void joinData () throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw  new CorruptedDataException();
        }
    }
}
