package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>(10);
        map.put("SecondName1", "Name1");
        map.put("SecondName1", "Name2");
        map.put("SecondName3", "Name1");
        map.put("SecondName4", "Name3");
        map.put("SecondName5", "Name3");
        map.put("SecondName6", "Name4");
        map.put("SecondName7", "Name7");
        map.put("SecondName8", "Name8");
        map.put("SecondName9", "Name9");
        map.put("SecondName10", "Name10");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
