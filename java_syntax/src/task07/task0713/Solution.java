package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> startList = new ArrayList<Integer>(20);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            startList.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> listMultipleThree = new ArrayList<Integer>();
        ArrayList<Integer> listMultipleTwo = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();
        for (Integer element : startList)
        {
            if (element % 3 == 0) listMultipleThree.add(element);
            if (element % 2 == 0) listMultipleTwo.add(element);
            if ((element % 3 != 0) && (element % 2 != 0)) listOther.add(element);
        }
        printList(listMultipleThree);
        printList(listMultipleTwo);
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer element : list)
        {
            System.out.println(element);
        }
    }
}
