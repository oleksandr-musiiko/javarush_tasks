package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        zerg1.name = "Igor";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Maxim";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Tetyana";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Ivona";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Michael";
        Protoss protoss1 = new Protoss();
        protoss1.name = "Goverla";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Pop Ivan";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Terra";
        Terran terran1 = new Terran();
        terran1.name = "Vaska";
        Terran terran2 = new Terran();
        terran2.name = "Murzik";
        Terran terran3 = new Terran();
        terran3.name = "Maria";
        Terran terran4 = new Terran();
        terran4.name = "Ricky";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
