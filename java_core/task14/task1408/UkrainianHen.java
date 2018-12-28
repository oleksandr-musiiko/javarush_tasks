package com.javarush.task.task14.task1408;

public  class UkrainianHen extends Hen
{
    private String country = Country.UKRAINE;
    private int countOfEggsPerMonth = 200;

    public int getCountOfEggsPerMonth()
    {
        return countOfEggsPerMonth;
    }

    public String getDescription()
    {
        return super.getDescription() + " Моя страна - " + this.country + ". Я несу " + countOfEggsPerMonth + " яиц в месяц.";
    }
}