package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandfather1 = new Human("Vasiliy", true, 55);
        Human grandfather2 = new Human("Arcadiy", true, 68);
        Human grandmother1 = new Human("Irina", false, 71);
        Human grandmother2 = new Human("Vorkusha", false, 81);
        Human father = new Human("Oleg", true, 42, grandfather1, grandmother1);
        Human mother = new Human("Maya", false, 40, grandfather2, grandmother2);
        Human child1 = new Human("Maria", false, 18, father, mother);
        Human child2 = new Human("Maxim", true, 19, father, mother);
        Human child3 = new Human("Olga", false, 21, father, mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.setName(name);
            this.setSex(sex);
            this.setAge(age);
            this.setFather(father);
            this.setMother(mother);
        }
        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.getName();
            text += ", пол: " + (this.getSex() ? "мужской" : "женский");
            text += ", возраст: " + this.getAge();

            if (this.getFather() != null)
                text += ", отец: " + this.getFather().getName();

            if (this.getMother() != null)
                text += ", мать: " + this.getMother().getName();

            return text;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSex() {
            return sex;
        }

        public void setSex(boolean sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Human getFather() {
            return father;
        }

        public void setFather(Human father) {
            this.father = father;
        }

        public Human getMother() {
            return mother;
        }

        public void setMother(Human mother) {
            this.mother = mother;
        }
    }
}






















