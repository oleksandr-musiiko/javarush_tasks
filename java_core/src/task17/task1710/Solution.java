package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]) {
            case "-c": {
                Person person = null;
                switch (args[2]) {
                    case "м": {
                        person = Person.createMale(args[1], (new SimpleDateFormat(args[3], Locale.ENGLISH)).parse(args[1]));
                        allPeople.add(allPeople.size(), person);
                        break;
                    }
                    case "ж": {
                        person = Person.createFemale(args[1], (new SimpleDateFormat(args[3], Locale.ENGLISH)).parse(args[1]));
                        allPeople.add(allPeople.size(), person);
                        break;
                    }
                }
                System.out.println(allPeople.indexOf(person));
                break;
            }
            case "-u": {
                allPeople.remove(Integer.parseInt(args[1]));
                switch (args[3]) {
                    case "м": {
                        allPeople.add(Integer.parseInt(args[1]), Person.createMale(args[2], (new SimpleDateFormat(args[4], Locale.ENGLISH)).parse(args[2])));
                        break;
                    }
                    case "ж": {
                        allPeople.add(Integer.parseInt(args[1]), Person.createFemale(args[2], (new SimpleDateFormat(args[4], Locale.ENGLISH)).parse(args[2])));
                    }
                }
                break;
            }
            case "-d": {
                allPeople.remove(Integer.parseInt(args[1]));
                Person person = Person.createMale(null, null);
                person.setSex(null);
                allPeople.add(Integer.parseInt(args[1]), person);
                break;
            }
            case "-i": {
                Person person = allPeople.get(Integer.parseInt(args[1]));
                DateFormat dateFormat = new SimpleDateFormat("DD-Mmm-YYYY");
                String sex = person.getSex().equals(Sex.MALE) ? "м" : "ж";
                System.out.println(person.getName() + " " + sex + " " + dateFormat.format(person.getBirthDay()));
                break;
            }

        }
    }
}
