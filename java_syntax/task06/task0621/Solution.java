package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandfatherName = reader.readLine();
        String grandmotherName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();

        String daughterName = reader.readLine();





        Cat grandfather = new Cat(grandfatherName);
        Cat grandmother = new Cat(grandmotherName);
        Cat father = new Cat(fatherName, null, grandfather);
        Cat mother = new Cat(motherName, grandmother, null);
        Cat son = new Cat(sonName, mother, father);
        Cat daughter = new Cat(daughterName, mother, father);
        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);


    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;


        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat parentMother)
        {
            this.name = name;
            this.parentMother = parentMother;
        }

        Cat(String name, Cat parentMother, Cat parentFather)
        {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString() {
            if ((parentMother == null) && (parentFather == null)) return "Cat name is " + name + ", no mother, no father";
            if ((parentMother != null) && (parentFather == null)) return "Cat name is " + name + ", mother is " + parentMother.name + ", no father";
            if ((parentMother == null) && (parentFather != null)) return "Cat name is " + name + ", no mother, father is " + parentFather.name;
            if ((parentMother != null) && (parentFather != null)) return "Cat name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name;
            return null;
        }
    }

}
