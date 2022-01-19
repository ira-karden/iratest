package com.example.java.HW3;
/*
Complete the method that takes a boolean value and return a "Yes" string for true, or a "No" string for false.
 */
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one of the values: true, false:" );
        boolean value = scanner.nextBoolean();
        if (value){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
