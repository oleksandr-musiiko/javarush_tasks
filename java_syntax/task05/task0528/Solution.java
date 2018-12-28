package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Date todayDate = new Date(2018, 07, 12);
        todayDate.toConsole();

    }

    public static class Date
    {
        private int year;
        private int month;
        private int day;

        public Date(int year, int month, int day)
        {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public void toConsole()
        {
            System.out.println(this.day + " " + this.month + " " + this.year);
        }
    }
}
