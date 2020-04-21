package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creat a Scanner object
        Scanner input  = new Scanner(System.in);

        //Prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int secondes = input.nextInt();//Declare a variable

        //Compute minutes and remainingSeconds
        int minutes = secondes / 60;
        int remainingSeconds = secondes % 60;

        //Display result
        System.out.println(secondes + " seconds is " + minutes + " minutes and "+ remainingSeconds
         + " seconds");
    }
}
