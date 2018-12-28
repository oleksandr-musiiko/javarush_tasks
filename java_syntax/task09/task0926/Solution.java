package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<int[]>(5);
        arrayList.add(new int[5]);
        arrayList.add(new int[2]);
        arrayList.add(new int[4]);
        arrayList.add(new int[7]);
        arrayList.add(new int[0]);
        arrayList.get(0)[0] = 1;
        arrayList.get(0)[1] = 2;
        arrayList.get(0)[2] = 3;
        arrayList.get(0)[3] = 4;
        arrayList.get(0)[4] = 5;
        arrayList.get(1)[0] = 1;
        arrayList.get(1)[1] = 2;
        arrayList.get(2)[0] = 1;
        arrayList.get(2)[1] = 343;
        arrayList.get(2)[2] = 238;
        arrayList.get(2)[3] = 2423;
        arrayList.get(3)[0] = 123134;
        arrayList.get(3)[1] = 24124;
        arrayList.get(3)[2] = 426425;
        arrayList.get(3)[3] = 53452;
        arrayList.get(3)[4] = 324523;
        arrayList.get(3)[5] = 421234;
        arrayList.get(3)[6] = 2432;
     /*   for (Integer[] element :
                arrayList) {
            for (Integer elementOfArray :
                    element) {
                System.out.println(elementOfArray);

            }

        }
*/

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
