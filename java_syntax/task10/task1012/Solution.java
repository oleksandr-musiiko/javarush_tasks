package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < alphabet.size(); i++)
        {
            map.put(alphabet.get(i), 0);
        }
        //проходим по списку строк
        for (int i = 0; i < list.size(); i++)
        {
            //проходим по символам строки
            for (int c = 0; c < list.get(i).length(); c++)
            {
                // ищем букву в списке букв
                //char сha = list.get(i).charAt(c);
                for (int a = 0; a < alphabet.size(); a++)
                {

                    if (list.get(i).charAt(c) == alphabet.get(a))
                    {
                       int value = map.get(alphabet.get(a));

                       map.put(alphabet.get(a), ++value);
                       //break;
                    }
                }
            }
        }

            for (int i = 0 ; i < alphabet.size(); i++)
            {
                int value = map.get(alphabet.get(i));
                System.out.println(alphabet.get(i) + " " + value);
        }
        // напишите тут ваш код
    }

}
