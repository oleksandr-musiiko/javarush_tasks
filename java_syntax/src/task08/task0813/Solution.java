package com.javarush.task.task08.task0813;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        String[] array = new String[] {"Ладонь",  "Лаванда", "Лето", "Лев", "Лик", "Ласка", "Лол", "Лапша", "Лобстер", "Лень",
                "Лакомство", "Лук", "Ливень", "Лавры", "Легенда", "Лотерея", "Лото", "Лоб", "Лоск", "Луанда"};
        set.addAll(Arrays.asList(array));
        return set;
    }

    public static void main(String[] args) {

    }
}
