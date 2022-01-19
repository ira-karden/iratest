package com.example.java.HW2;

import java.util.Scanner;

public class Task1_OtherSolutionVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int numberOfMonth = scanner.nextInt();
        System.out.println("Enter the year value:");
        int yearValue = scanner.nextInt();
        if (numberOfMonth < 0 || numberOfMonth > 12){
            System.out.println("Month value is not correct. Enter the value from 1 to 12");
        }
        else if (yearValue <= 0){
            numberOfMonth = 0;
        }
        switch (numberOfMonth){
            case 0:
                if (yearValue > 0) {
                    System.out.println("Month value is not correct. Enter the value from 1 to 12");
                } else {
                    System.out.println("Year value is not correct. Value cannot be less than 1");
                }
                break;
            case 1:
                System.out.println("January "+yearValue+" has 31 days");
                break;
            case 2:
                if (yearValue  % 4 == 0) {
                    System.out.println("February "+yearValue+" has 29 days");
                } else {
                    System.out.println("February "+yearValue+" has 28 days");
            }
                break;
            case 3:
                System.out.println("March "+yearValue+" has 31 days");
                break;
            case 4:
                System.out.println("April "+yearValue+" has 30 days");
                break;
            case 5:
                System.out.println("May "+yearValue+" has 31 days");
                break;
            case 6:
                System.out.println("June "+yearValue+" has 30 days");
                break;
            case 7:
                System.out.println("July "+yearValue+" has 31 days");
                break;
            case 8:
                System.out.println("August "+yearValue+" has 31 days");
                break;
            case 9:
                System.out.println("September "+yearValue+" has 30 days");
                break;
            case 10:
                System.out.println("October "+yearValue+" has 31 days");
                break;
            case 11:
                System.out.println("November "+yearValue+" has 30 days");
                break;
            case 12:
                System.out.println("December "+yearValue+" has 31 days");
        }
    }
}
