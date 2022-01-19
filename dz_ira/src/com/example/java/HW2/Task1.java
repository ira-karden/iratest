package com.example.java.HW2;
/*
Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016

Expected Output :
February 2016 has 29 days
 */

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int numberOfMonth = scanner.nextInt();
        System.out.println("Enter the year value:");
        int yearValue = scanner.nextInt();
        if (numberOfMonth < 1 || numberOfMonth > 12){
            System.out.println("Month value is not correct. Enter the value from 1 to 12");
        }
        else if (yearValue <= 0){
            System.out.println("Year value is not correct. Value cannot be less than 1");
        }
        else if (numberOfMonth == 2){
           if (yearValue  % 4 == 0) {
               System.out.println("February "+yearValue+" has 29 days");
           }
           else {
               System.out.println("February "+yearValue+" has 28 days");
           }
        }
        else if (numberOfMonth == 1){
            System.out.println("January "+yearValue+" has 31 days");
        }
        else if (numberOfMonth == 3){
            System.out.println("March "+yearValue+" has 31 days");
        }
        else if (numberOfMonth == 4){
            System.out.println("April "+yearValue+" has 30 days");
        }
        else if (numberOfMonth == 5){
            System.out.println("May "+yearValue+" has 31 days");
        }
        else if (numberOfMonth == 6){
            System.out.println("June "+yearValue+" has 30 days");
        }
        else if (numberOfMonth == 7){
            System.out.println("July "+yearValue+" has 31 days");
        }
        else if (numberOfMonth == 8){
            System.out.println("August "+yearValue+" has 31 days");
        }
        else if (numberOfMonth == 9){
            System.out.println("September "+yearValue+" has 30 days");
        }
        else if (numberOfMonth == 10){
            System.out.println("October "+yearValue+" has 31 days");
        }
        else if (numberOfMonth == 11){
            System.out.println("November "+yearValue+" has 30 days");
        }
        else if (numberOfMonth == 12){
            System.out.println("December "+yearValue+" has 31 days");
        }
    }
}