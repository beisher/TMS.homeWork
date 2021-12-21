package com.tms.lesson10io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainSerial {
    public static void main(String[] args) {
        User user = new User("Ksenia" , 25 , SEX.WOMAN);

        ObjectOutputStream objos = null;
        try{
            objos = new ObjectOutputStream(new FileOutputStream("/Users/beish/Documents/User.dat"));
            objos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(objos != null){
                try {
                    objos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
