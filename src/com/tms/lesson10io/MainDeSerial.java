package com.tms.lesson10io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeSerial {
    public static void main(String[] args) {
        try(ObjectInputStream objis = new ObjectInputStream(new FileInputStream("/Users/beish/Documents/User.dat"))) {
            Object o = objis.readObject();
            if(o instanceof User){
                User user = (User)o;
                System.out.println(user);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
