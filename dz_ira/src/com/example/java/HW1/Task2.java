package com.example.java.HW1;

/*2. Write a Java program to convert minutes into a number of years and days.
Test Data
Input the number of minutes: 3456789
Expected Output :
3456789 minutes is approximately 6 years and 210 days*/
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int minutesInDay = 1440;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value in minutes:");
        int minutesValue = s.nextInt();
        int totalDaysValue = minutesValue/minutesInDay;
        int yearsValue = totalDaysValue/365;
        int daysValue = totalDaysValue%365;
        System.out.println(minutesValue+" minutes is approximately "+yearsValue+" years and "+ daysValue+" days");
    }
}
