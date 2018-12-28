package com.javarush.task.task08.task0815;

import sun.awt.SunHints;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>(10);
        map.put("Alison", "Burgers");
        map.put("Addy", "Tomasson");
        map.put("Ruiqi", "Li");
        map.put("Tomas", "Jefferson");
        map.put("Tony", "Chicken");
        map.put("Entoni", "Darling");
        map.put("Lyapis", "Trubetskoy");
        map.put("Arcadiy", "Cots");
        map.put("Linda", "Cartman");
        map.put("Li", "Muhhamed");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair:
             map.entrySet()) {
            if (name.equals(pair.getValue())) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;
        
    }

    public static void main(String[] args) {

    }
}
