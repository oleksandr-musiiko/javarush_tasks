package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human children1 = new Human("Irina", false, 20, new ArrayList<Human>());
        Human children2 = new Human("Maxim", true, 23, new ArrayList<Human>());
        Human children3 = new Human("Igal", true, 32, new ArrayList<Human>());
        Human father = new Human("David", true, 47, new ArrayList<Human>(Arrays.asList(children1, children2, children3)));
        Human mother = new Human("Maria", false, 49, new ArrayList<Human>(Arrays.asList(children1, children2, children3)));
        Human grandfather1 = new Human("Vasiliy", true, 80, new ArrayList<Human>(Arrays.asList(father)));
        Human grandfather2 = new Human("Oscar", true, 72, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandmother1 = new Human("Vorkusha", false, 75, new ArrayList<Human>(Arrays.asList(father)));
        Human grandmother2 = new Human("Oksana", false, 70, new ArrayList<Human>(Arrays.asList(mother)));
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);

    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public int age;
        public boolean sex;

        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
