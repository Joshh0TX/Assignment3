package org.example;

import java.util.Scanner;

//Write a program that prompts user to enter a letter grade A, B, C, D or F and displays its corresponding numeric value 4, 3, 2, 1 or 0
//Example: Enter a letter B, the numeric value for B is 3
//Pseudocode
//Start
//initialize the letter grade using array
//initialize the number grade
//Set conditions
//Compare them individually by prompting user for input
//Test code
public class Grading {
    public static void main(String[] args) {
        String[] letterGrade = {"A", "B","C","D","F"};
        int[] numericValue = {4, 3, 2, 1, 0};

        //Here, we prompt the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter grade (A, B, C, D, F): ");
        String letter = scanner.nextLine().toUpperCase();

        //Setting the conditions
        for (int i = 0; i< letterGrade.length; i++) {
            if (letter.equals(letterGrade[i])) {
                System.out.println(numericValue[i]);
                break;
            } else{
                System.out.println("Invalid character");
            }
        }
        scanner.close();
    }
}

