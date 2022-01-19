package com.example.java.HW3;

/*
Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
 */
import java.util.Scanner;
public class Task6 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter weight in kg:");
            double weightInKg = s.nextDouble();
            System.out.println("Enter height in cm:");
            double heightInSm = s.nextDouble();
            double heightInSquareMetre = (heightInSm/100)*(heightInSm/100);
            double bmi = weightInKg/heightInSquareMetre;
            if (bmi <= 18.5){
                System.out.println("Underweight");
            }
            else if (bmi<=25.0){
                System.out.println("Normal");
            }
            else if (bmi <= 30.0){
                System.out.println("Overweight");
            }
            else if (bmi > 30){
                System.out.println("Obese");
            }

        }
}
