package com.example.java.HW3;
/*
Nathan loves cycling.
Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
 */
import java.util.Scanner;
import java.lang.Math;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter time in hours:");
        double timeInHours = scanner.nextDouble();
        int totalLitres = (int)(Math.floor(timeInHours * 0.5));
        System.out.println("Litres: "+totalLitres);
    }
}
