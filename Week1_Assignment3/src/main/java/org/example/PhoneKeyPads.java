//This was difficult

package org.example;

import java.util.Scanner;

//Create a program that prompts a user to enter a letter and display it's corresponding number according to the standard letter and number mapping on a telephone
//Pseudocode
//Start
//Create an array for all letters in the alphabets
//Create an array for the numbers on the key pad
//Assign letters to their respective numbers using if statements
//Use a for loop to iterate over the conditions
//Prompt user for input
//Print output
public class PhoneKeyPads {
    public static void main(String[] args) {
        //Declaring variables
        String alphabets = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String numbers = "2 3 4 5 6 7 8 9";

        //Manipulating alphabets by splitting into an array
        String[] splitAlphabets = alphabets.toLowerCase().split(" ");
        String[] splitNumbers = numbers.split(" ");

        //Prompt user for input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 2 and 9");
        String number = scanner.nextLine();


        //Setting conditions
        for (int i = 0; number.equals(splitNumbers[i]); i++) {   //number inputted corresponds to the number in the array
            for (int j = 0; splitAlphabets[j].equals(0) ; j++){  //letter given corresponds to the number in the array
                String assignedAlphabet = "";
                if (assignedAlphabet.contains(splitAlphabets[j])){
                    System.out.println("A");
                }
            }
        }
    }
}


