package com.example.java.HW3;
/*
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
 */
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of petals for first flower:");
        int countPetals1 = scanner.nextInt();
        System.out.println("Enter the count of petals for second flower:");
        int countPetals2 = scanner.nextInt();
        if (countPetals1 % 2 ==0 && countPetals2 % 2==0){
            System.out.println(false);
        }
        else if (countPetals1 % 2 !=0 && countPetals2 % 2 !=0){
            System.out.println(false);
        }
        else {
            System.out.println(true);
        }
    }

}
