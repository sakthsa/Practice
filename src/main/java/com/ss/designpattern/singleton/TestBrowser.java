package com.ss.designpattern.singleton;

public class TestBrowser {
    public static void main(String[] args) {

        Runnable task = () -> {
            Browser.getInstance().displayBrowserName();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        Thread t5 = new Thread(task);
        Thread t6 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

        try {
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
