package com.example.java.HW4;
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
        int totalDaysValue = calculationTotalDaysValue(minutesValue, minutesInDay);
        int DaysInYear = 365;
        int yearsValue = calculationYearsValue(totalDaysValue,DaysInYear);
        int daysValue = calculationDaysValue(totalDaysValue,DaysInYear);
        System.out.println(minutesValue+" minutes is approximately "+yearsValue+" years and "+ daysValue+" days");
    }
    public static int calculationTotalDaysValue (int usersValueInMinutes, int minutesInDay) {
        return usersValueInMinutes / minutesInDay;
    }
    public static int calculationYearsValue (int totalDays, int DaysInYear) {
        return totalDays / DaysInYear;
    }
    public static int calculationDaysValue (int totalDays, int DaysInYear) {
        return totalDays % DaysInYear;
    }
}
