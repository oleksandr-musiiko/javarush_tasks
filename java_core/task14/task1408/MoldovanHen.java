package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen
{
    private String country = Country.MOLDOVA;
    private int countOfEggsPerMonth = 100;

    public int getCountOfEggsPerMonth()
    {
        return this.countOfEggsPerMonth;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + countOfEggsPerMonth + " яиц в месяц.";
    }
}