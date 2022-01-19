package com.example.java.HW3;
/*
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.
 */

import java.util.Scanner;
public class Task9SecondSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int monthValue = scanner.nextInt();
        if (monthValue == 1 || monthValue == 2 || monthValue == 3){
            System.out.println("Its part of the first quarter");
        }
        else if (monthValue == 4 || monthValue == 5 || monthValue == 6){
            System.out.println("Its part of the second quarter");
        }
        else if (monthValue == 7 || monthValue == 8 || monthValue == 9){
            System.out.println("Its part of the third quarter");
        }
        else if (monthValue == 10 || monthValue == 11 || monthValue == 12){
            System.out.println("Its part of the fourth quarter");
        }
        else {
            System.out.println("Incorrect number of month. Enter value from 1 to 12.");
        }
    }
}
