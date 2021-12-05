package com.tms.lesson8;

import java.util.Collection;

public class PrintServiceSex implements PrintService{
    private Collection<User> col;
    private SEX sex;

    @Override
    public void printUsers(Collection<User> col, SEX sex) {
        this.col = col;
        this.sex = sex;

        for(User user : col){
            if(this.sex.equals(user.getSex())){
                System.out.println(user);
            }
        }
    }
}
