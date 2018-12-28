package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList1 = new ArrayList<String>();
        String s1 = "Value1";
        String s2 = "Value2";
        arrayList1.add(s1);
        arrayList1.add(s2);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Vaska");
        ArrayList<String>[] arrayLists = new ArrayList[2];
        arrayLists[0] = arrayList1;
        arrayLists[1] = arrayList2;
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}