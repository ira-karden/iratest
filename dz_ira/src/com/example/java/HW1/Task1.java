package com.example.java.HW1;

/* Write a Java program that reads a number in inches, converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        double oneMeter = 0.0254;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the inch value:");
        double inchValue = s.nextDouble();
        double meterValue = inchValue*oneMeter;
        System.out.println(inchValue+" inch is "+meterValue+" meters");
//Вывод даты получения задачи, выполнения и имени разработчика:
        String devName = "Iryna Mochulska";
        System.out.println("Dev: "+devName);
        Calendar calendar = new GregorianCalendar();
        Calendar calendar2 = new GregorianCalendar(2021, Calendar.DECEMBER , 30);
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 30);
        calendar.set(Calendar.MINUTE, 49);
        calendar.set(Calendar.SECOND, 0);
        calendar.add(Calendar.MONTH, -1);
        System.out.println("Date the tasks were received: "+calendar.getTime());
        calendar.set(Calendar.YEAR, 2022);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 18);
        calendar.set(Calendar.HOUR_OF_DAY, 22);
        calendar.set(Calendar.MINUTE, 22);
        calendar.set(Calendar.SECOND, 0);
        System.out.println("Task was completed:"+calendar.getTime());
    }
}
