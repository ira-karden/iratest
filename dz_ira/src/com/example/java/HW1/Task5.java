package com.example.java.HW1;
/*
Write a Java program to generate random integers in a specific range.(Hint: Use Math class)
 */
import java.util.Scanner;
import java.lang.Math;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer for start of range:");
        int rangeFrom = scanner.nextInt();
        System.out.println("Enter integer for end of range:");
        int rangeTo = scanner.nextInt();
        int randomValue = (int)(Math.random()*(rangeTo-rangeFrom+1)+rangeFrom);
        System.out.println(randomValue);
    }
}

