package com.ss.test;

public class methodOverloading {

    public static void main(String[] args) {
        methodOver();
    }

    public static void methodOver(){
        System.out.println("Default method");

    }

    public static void methodOver(String name){

    }

    public static void methodOver(Integer name){

    }

    public static void methodOver(Integer name, String s){

    }

    public static void methodOver( String s, Integer name){

    }

    public static String methodOverReturn(){

        return "";

    }

    public static String methodOverReturn(String name){

        return "";
    }

    public static String methodOverReturn(Integer name){

        return "";
    }

    public static Integer methodOverReturn(Integer name, String s){

        return name;
    }

    public static String methodOverReturn( String s, Integer name){

        return "";
    }



}
