package com.javarush.task.task14.task1408;

public  class RussianHen extends Hen
{
    private  String country = Country.RUSSIA;
    private int countOfEggsPerMonth = 300;

    public int getCountOfEggsPerMonth()
    {
        return this.countOfEggsPerMonth;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + countOfEggsPerMonth + " яиц в месяц.";
    }
}