package com.ss.designpattern.singleton;

import java.sql.Date;
import java.sql.Time;
import java.util.Calendar;

public class Browser {

    private volatile static Browser browser;

    private Browser(){
        if(browser!=null){
            throw new IllegalArgumentException("instance is already exist... ");
        }

    }
    public static Browser getInstance(){
        if(browser==null) {
            synchronized (Browser.class) {
                if (browser == null) {
                    System.out.println("Creating new instance....");
                    browser = new Browser();
                }
            }
        }
        return browser;
    }

    public void displayBrowserName(){
        System.out.println("Chrome browser .... "+Thread.currentThread().getName() +
                " : Time : "+ Calendar.getInstance().get(Calendar.MILLISECOND) +
                " : Hashcode : "+this.hashCode());

    }
}
