package com.example.java.HW3;
/*
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.


 */
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        int[][] month = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month:");
        int monthValue = scanner.nextInt();
        int resultSearchingInArray = 0;
        for (int i=0; i<month.length;i++){
            if (resultSearchingInArray!=0){
                break;
            }
            for (int j=0; j<month.length;j++){
                if (monthValue == month[0][j]){
                    resultSearchingInArray = 1;
                    System.out.println("Its part of the first quarter");
                    break;
                }
                else if (monthValue == month[1][j]){
                    resultSearchingInArray = 1;
                    System.out.println("Its part of the second quarter");
                    break;
                }
                else if (monthValue == month[2][j]){
                    resultSearchingInArray = 1;
                    System.out.println("Its part of the third quarter");
                    break;
                }
                else if (monthValue == month[3][j]){
                    resultSearchingInArray = 1;
                    System.out.println("Its part of the fourth quarter");
                    break;
                }
            }


        }

    }


}
