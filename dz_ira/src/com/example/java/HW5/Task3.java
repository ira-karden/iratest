package com.example.java.HW5;

import java.util.Arrays;

/*
Write a function to split a string and convert it into an array of words. For example:
 */
public class Task3 {
    public static void main(String[] args) {
        String test = "I love arrays they are my favorite";
        System.out.println(Arrays.toString(newArray(test)));
    }
    static String[] newArray (String test){
        return test.split(" ");
    }
}
