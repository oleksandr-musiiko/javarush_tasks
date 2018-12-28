package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<Movie> arrayList1 = new ArrayList<Movie>();
        while (true)
        {
            String s = reader.readLine();

            Movie movie = MovieFactory.getMovie(s);

            if (!(s.equals("soapOpera") || s.equals("cartoon") || s.equals("thriller")))
            {
                
                break;
            }
            if (movie instanceof Cartoon) arrayList1.add(movie);
            if (movie instanceof Thriller) arrayList1.add(movie);
            if (movie instanceof SoapOpera) arrayList1.add(movie);
        }

       if (arrayList1.size() > 0) {
           for (Movie element :
                   arrayList1) {
               System.out.println(element.getClass().getSimpleName());
           }
       }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("thriller".equals(key))
            {
                movie = new Thriller();
            }
            if ("cartoon".equals(key))
            {
                movie = new Cartoon();
            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Thriller extends Movie
    {

    }

    static class Cartoon extends Movie
    {

    }

    //Напишите тут ваши классы, пункт 3
}
