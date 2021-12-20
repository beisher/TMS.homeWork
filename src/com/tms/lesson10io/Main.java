package com.tms.lesson10io;

import java.io.*;

public class Main {
    public static void main(String[] args) {


        try ( FileWriter file1 = new FileWriter("/Users/beish/Documents/Vladislav.txt"); FileWriter file2 = new FileWriter("/Users/beish/Documents/Ksenia.txt");){
            File file = new File("/Users/beish/Documents/TEXT.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            FileWriter c = null;
            String line = reader.readLine();
            while (line != null) {
                if(line.startsWith("Vladislav")){
                    c = file1;

                }else if(line.startsWith("Ksenia")){
                    c = file2;

                }
                c.write(line+'\n');
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}