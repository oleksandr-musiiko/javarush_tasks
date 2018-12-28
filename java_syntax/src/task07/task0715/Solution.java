package com.javarush.task.task07.task0715;


import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>(3);
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");
        for(int i = 1; i < arrayList.size() + 1; i = i + 2)
        {
            arrayList.add(i, "именно");
        }
        for (String element : arrayList)
        {
            System.out.println(element);
        }
    }
}
