package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            if (reader.ready()) {
                firstFileName = reader.readLine();
                secondFileName = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName = "";
        private String fileContent = "";

        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        public String getFileContent() {
            return fileContent;
        }

        @Override
        public void run() {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));

                while (reader.ready()) {
                    fileContent += reader.readLine() + " ";
                }


            } catch (Exception e) {

            }
        }








    }
    //add your code here - добавьте код тут
}
