package com.example.java.HW1;

/* . Write a Java program to compute body mass index (BMI).
Test Data
Input weight in pounds: 452
Input height in inches: 72
Expected Output:
Body Mass Index is 61.30159143458721 */

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        double onePound = 0.45359237;
        double oneInch = 0.0254;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double poundWeight = s.nextDouble();
        System.out.println("Enter height in inches:");
        double inchHeight = s.nextDouble();
        double kiloWeight = poundWeight*onePound;
        double meterHeight = inchHeight*oneInch;
        double bmi = kiloWeight/(meterHeight*meterHeight);
        System.out.println("Body Mass Index is "+bmi);

    }
}
