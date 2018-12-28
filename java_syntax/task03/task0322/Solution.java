package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine(), name2 = reader.readLine(), name3 = reader.readLine();
        String plus = " + ";
        System.out.println(name1 + plus + name2 + plus + name3 + " = Чистая любовь, да-да!");
    }
}