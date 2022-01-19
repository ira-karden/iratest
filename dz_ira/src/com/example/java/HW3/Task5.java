package com.example.java.HW3;
/*
You're writing code to control your town's traffic lights.
You need a function to handle each change from green, to yellow, to red, and then to green again.

Complete the function that takes a string as an argument representing the current state of the light
and returns a string representing the state the light should change to.
For example, update_light('green') should return 'yellow'.
 */
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        String[] colorsOfSignal = new String[]{"green", "yellow", "red", "yellow"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("For starting the traffic light, you need to set the initial default color value from (green, yellow, red):");
        String currentLight = scanner.nextLine();
        int indexOfCurrentLight = 0;
        int k = 0; // указала для удобства проверки цикла, на бесконечный цикл неудобно смотреть
        while(k<3){ //для беспрерывной работы светафора k удалить везде и указать в условии -(currentLight!=null или true)
            if (currentLight.equals("red")){
            indexOfCurrentLight = 2;
             }
            else if (currentLight.equals("yellow")){
            indexOfCurrentLight = 1;
            }
            else if (currentLight.equals("green")){
            indexOfCurrentLight = 0;
            }
            for (int i=indexOfCurrentLight; i< colorsOfSignal.length; i++){
                System.out.println(colorsOfSignal[i]);
            }
            currentLight ="green";
            k++;
        }
    }
}
