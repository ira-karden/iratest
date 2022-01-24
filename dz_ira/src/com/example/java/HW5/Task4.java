package com.example.java.HW5;

/*
It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
 */
public class Task4 {
    public static void main(String[] args) {
        String str = "characters";
        System.out.println(RemoveStr(str));
    }

    static String RemoveStr (String str){
        if (str.length() > 2) {
            return str.substring(1, str.length()-1);
        }
        return "";
    }
}
