package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> addresses = new HashMap<String, String>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            addresses.put(family, city);
        }

        //read home number
        String thisCity = reader.readLine();
        for (Map.Entry<String, String> pair : addresses.entrySet()) {
            if (pair.getValue().equals(thisCity)) {
                System.out.println(pair.getKey());
                break;
            }

        }


        //}
    }
}
