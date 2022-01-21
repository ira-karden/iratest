package com.example.java.HW4;
/*
Write a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometres per hour

Test Data
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output :
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter distance in meters:");
        double meterDistance = s.nextDouble();
        System.out.println("Enter hour value:");
        int hoursValue = s.nextInt();
        System.out.println("Enter minutes value:");
        int minutesValue = s.nextInt();
        System.out.println("Enter seconds value:");
        int secondsValue = s.nextInt();
        double speedMeterSec = calculationSpeedMeterSec(meterDistance,hoursValue,minutesValue,secondsValue);
        double speedKmHour = calculationSpeedKmHour(meterDistance,hoursValue,minutesValue,secondsValue);
        System.out.println("Your speed in meters/second is "+speedMeterSec);
        System.out.println("Your speed in km/h is "+speedKmHour);
    }
    public static double calculationSpeedMeterSec (double distance, int hours, int minutes, int seconds) {
        int totalSeconds = hours*3600+minutes*60+seconds;
        double result = distance/totalSeconds;
        return  result;
    }
    public static double calculationSpeedKmHour (double distance, int hours, int minutes, int seconds) {
        double oneKmHourFromMeterSec = 3.6;
        double result = calculationSpeedMeterSec(distance,hours,minutes,seconds)*oneKmHourFromMeterSec;
        return  result;
    }
}
