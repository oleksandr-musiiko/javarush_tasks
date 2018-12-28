package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vaska", new Cat("Vaska"));
        map.put("Murzik", new Cat("Murzik"));
        map.put("Murka", new Cat("Murka"));
        map.put("Dimka", new Cat("Dimka"));
        map.put("Crolik", new Cat("Crolik"));
        map.put("Anatoly", new Cat("Anatoly"));
        map.put("Arkasha", new Cat("Arkasha"));
        map.put("Barsik", new Cat("Barsik"));
        map.put("Fedor", new Cat("Fedor"));
        map.put("Matroskin", new Cat("Matroskin"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair:
             map.entrySet()) {
            cats.add(pair.getValue());

        }
        return cats;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
