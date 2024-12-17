package com.ss.test;

public class NumberThread implements Runnable{
    private int i;

    public NumberThread(int i){
        this.i = i;
    }

    @Override
    public void run() {

        System.out.println("Number : "+i+ "Thread Name : "+Thread.currentThread().getName());

    }
}
