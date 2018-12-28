package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.text.*;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateString = reader.readLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH );
        Date date = simpleDateFormat.parse(dateString);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String result = simpleDateFormat1.format(date).toUpperCase();
        System.out.println(result);
    }
}
