package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen
{
    private String country = Country.BELARUS;
    private int countOfEggsPerMonth = 400;


    public int getCountOfEggsPerMonth()
    {
        return this.countOfEggsPerMonth;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + countOfEggsPerMonth + " яиц в месяц.";
    }

}