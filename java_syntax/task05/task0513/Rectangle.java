package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int height;
    private int width;

    public void initialize()
    {

    }

    public void initialize(int top){
        this.top = top;
    }

    public void initialize(int left, int width)
    {
        this.left = left;
        this.width = width;
    }

    public  void initialize(int top, int left, int height)
    {
        this.top = top;
        this.left = left;
        this.height = height;
    }

    public void initialize(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }
    public static void main(String[] args) {

    }
}
