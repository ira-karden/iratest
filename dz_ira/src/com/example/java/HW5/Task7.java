package com.example.java.HW5;

public class Task7 {
    public static void main(String[] args) {
        int num = 6;
        System.out.print(multiTable(num));
    }
    static String multiTable(int num){
        int n = 1;
        String tab = "";
        while (n<=10){
            tab = tab.concat("\n"+n+" * "+num+" = "+(n*num));
            n++;
        }
        return tab.trim();
        }

    }

