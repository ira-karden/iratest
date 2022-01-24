package com.example.java.HW5;
/*
Simple, remove the spaces from the string, then return the resultant string.
 */
public class Task1 {
    public static void main(String[] args) {
        String x = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace(x));
    }
    public static String noSpace(final String x) {

        return x.replace(" ","");
    }

}
