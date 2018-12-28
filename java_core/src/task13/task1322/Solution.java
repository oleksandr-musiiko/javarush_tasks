package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.ArrayList;
import java.util.Collection;

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    static  public  class StringObject<Object> implements SimpleObject<String>
    {
        public SimpleObject<String> getInstance()
        {
            return new StringObject<String>();
        }
    }
}
