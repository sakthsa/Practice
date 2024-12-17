package com.ss.test;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("New : "+ Thread.currentThread().getName());
    }
}
