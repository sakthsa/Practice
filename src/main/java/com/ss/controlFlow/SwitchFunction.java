package com.ss.controlFlow;

public class SwitchFunction {
    public static void main(String[] args) {
        int a = 3;
        switch(a){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                case 4:
            case 5:

                System.out.println("case 3,4,5");
                break;
            default :
                System.out.println("Default");
        }


        System.out.println("******* : "+monthQuater("dff"));
        printweek(0);

    }

    public static String monthQuater(String month){
        return switch (month){
            case "JAN", "FEB", "MAR" -> "1st Quater";
            case "APR", "MAY", "JUN" -> "2nd Quater";
            case "JUL", "AUG", "SEP" -> "3rd Quater";
            default -> {
                yield "not matching";
            }
        };

    }

    public static void printweek(int day){
        String dayOfWeek = switch(day){
            case 0 -> "Sunday";
            default -> "not matching";
        };
        System.out.println("dayOfWeek : "+dayOfWeek);
    }


}
