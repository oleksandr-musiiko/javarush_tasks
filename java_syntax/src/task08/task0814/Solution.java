package com.javarush.task.task08.task0814;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>(20);
        Integer array[] =  {10, 11, 12, 13, 14, 15, 16, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, 17, 18, 19};
        set.addAll(Arrays.asList(array));
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            Integer element = iterator.next();
            if (element > 10) iterator.remove();

        }
        return set;
    }

    public static void main(String[] args) {

    }
}
