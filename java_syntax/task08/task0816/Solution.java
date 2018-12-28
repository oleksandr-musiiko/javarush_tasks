package com.javarush.task.task08.task0816;

import java.util.*;
import java.text.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        try {
            map.put("Stallone", df.parse("JUNE 1 1980"));
            map.put("Lastname2", df.parse("JULY 3 1990"));
            map.put("Lastname3", df.parse("JULY 2 1990"));
            map.put("Lastname4", df.parse("JUNE 2 1990"));
            map.put("Lastname5", df.parse("JULY 2 1990"));
            map.put("Lastname6", df.parse("JULY 2 1990"));
            map.put("Lastname7", df.parse("JULY 2 1990"));
            map.put("Lastname8", df.parse("JULY 2 1990"));
            map.put("Lastname9", df.parse("JULY 2 1990"));
            map.put("Lastname10", df.parse("JULY 2 1990"));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

            while (iterator.hasNext())
            {
                HashMap.Entry<String, Date> pair = iterator.next();
                Date thisDate = pair.getValue();
                if ((thisDate.getMonth() >= 5) && (thisDate.getMonth() <= 7))
                    iterator.remove();
            }



    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> map = createMap();

        removeAllSummerPeople(map);

        for (Map.Entry<String, Date> pair:
             map.entrySet()) {
            System.out.println(pair);

        }
    }
}
