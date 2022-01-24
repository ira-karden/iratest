package com.example.java.HW5;

/*
Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them. Sam Harris => S.H
 */
public class Task5 {
    public static void main(String[] args) {
        String fullName = "Sam Harris";
        System.out.println(initials(fullName));
    }
    static String initials (String fullName){
        String [] Name = fullName.split(" ");
        String initials = Name[0].substring(0,1)+"."+Name[1].substring(0,1);
        return initials;
    }
}
