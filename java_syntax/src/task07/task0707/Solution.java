package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>(5);
        arrayList.add("Value 1");
        arrayList.add("Value 2");
        arrayList.add("Value 3");
        arrayList.add("Value 4");
        arrayList.add("Value 5");
        System.out.println(arrayList.size());

    }
}
