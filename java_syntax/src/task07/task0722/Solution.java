package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>(5);
        for(;;) {
            String s = reader.readLine();
            if (s.equals("end")) break;
            else list.add(s);
        }
        for (String element:
             list)
        {
            System.out.println(element);
        }
        //напишите тут ваш код
    }
}