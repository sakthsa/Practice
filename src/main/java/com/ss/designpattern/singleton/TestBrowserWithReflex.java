package com.ss.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestBrowserWithReflex {



    public static void main(String[] args) {

        Browser instance1 = Browser.getInstance();
        Browser instance2 = Browser.getInstance();
        Browser instance3 = null;

        try {
            Constructor<Browser> constructor = Browser.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance3 = constructor.newInstance();
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        instance1.displayBrowserName();
        instance2.displayBrowserName();
        instance3.displayBrowserName();
    }
}
