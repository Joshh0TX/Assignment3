package org.example;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        //Check if letter is a vowel or consonant

        String vowel = "a e i o u";

        String[] splitVowel = vowel.split(" ");

        String[] upperCaseVowel = vowel.toUpperCase().split(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter of the alphabet");
        String letter = scanner.nextLine().toLowerCase();
        for (int i = 0; i <=4; i++) {
            if (letter.contains(upperCaseVowel[i])||letter.contains(splitVowel[i])) {
                System.out.println("This is a vowel");
                break;
            } else {
                    System.out.println("This is a consonant");
            }
        }
    }
}

