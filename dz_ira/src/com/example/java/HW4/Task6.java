package com.example.java.HW4;
/*
Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016

Expected Output :
February 2016 has 29 days
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int numberOfMonth = scanner.nextInt();
        System.out.println("Enter the year value:");
        int yearValue = scanner.nextInt();
        System.out.println(definedsDaysInMonth(numberOfMonth,yearValue));
    }
    static String definedsDaysInMonth (int numberOfMonth, int yearValue) {
        if (yearValue > 0){
            switch (numberOfMonth){
                case 1:
                    return  "January "+yearValue+" has 31 days";
                case 2:
                    if (yearValue  % 4 == 0) {
                        return "February "+yearValue+" has 29 days";
                    } else {
                        return  "February "+yearValue+" has 28 days";
                    }
                case 3:
                    return  "March "+yearValue+" has 31 days";
                case 4:
                    return "April "+yearValue+" has 30 days";
                case 5:
                    return "May "+yearValue+" has 31 days";
                case 6:
                    return "June "+yearValue+" has 30 days";
                case 7:
                    return "July "+yearValue+" has 31 days";
                case 8:
                    return "August "+yearValue+" has 31 days";
                case 9:
                    return "September "+yearValue+" has 30 days";
                case 10:
                    return "October "+yearValue+" has 31 days";
                case 11:
                    return "November "+yearValue+" has 30 days";
                case 12:
                    return "December "+yearValue+" has 31 days";
            }
        }
        else {
            return "Year value is not correct. Value cannot be less than 1";
        }
        return "Month value is not correct";
    }
}
