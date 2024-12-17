package com.ss.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("current : "+ Thread.currentThread().getName());
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i =0; i <=100; i++){
            NumberThread hp = new NumberThread(i);
            executor.submit(hp);
        //Thread t1 = new Thread(hp);
        //t1.start();

            System.out.println(i);
        }
    }
}
