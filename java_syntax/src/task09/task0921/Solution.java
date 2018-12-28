package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try {
            for (;;) {
                int n = Integer.parseInt(reader.readLine());
                arrayList.add(n);
            }

        }
        catch (NumberFormatException e)
        {

        }
        catch (IOException e)
            {

            }
        System.out.println();
        for (Integer element:
                arrayList) {


            System.out.println(element);
        }

    }
}
