package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date thisDate = format.parse(date);
        int yearOfThisDate = thisDate.getYear();
        Date startDate = new Date();
        startDate.setYear(yearOfThisDate);
        startDate.setDate(0);
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setMonth(0);
        long ms = thisDate.getTime() - startDate.getTime();
        long days = ms / 1000 / 60 / 60 / 24;
        if (days % 2 != 0)
        {
            return false;
        }
        return true;
    }
}
