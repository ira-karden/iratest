package com.example.java.HW5;
/*
Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
 */
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tne your name:");
        String name = scanner.nextLine();
        System.out.println(Hello(name));
    }
    static String Hello (String name){
        return "Hello, "+name+" how are you doing today?";
    }
}
