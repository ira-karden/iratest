package com.example.java.HW4;

/* Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        double oneMeter = 0.0254;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the inch value:");
        double inchValue = s.nextDouble();
        double meterValue = calculationMeterValue(inchValue, oneMeter);
        System.out.println(inchValue+" inch is "+meterValue+" meters");
    }

    public static double calculationMeterValue (double inchValue, double oneMeter) {
        return inchValue * oneMeter;
    }
}
