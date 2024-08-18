//Pseudocode
//Declare and initialize array
//Use the random method
//Output

package org.example;

public class RandomCharacter {
    public static void main(String[] args) {
        String[] upperCaseLetter = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


        int random = (int) (Math.random() * upperCaseLetter.length);

        // Print the randomly selected uppercase letter
        System.out.println("Random uppercase letter: " + upperCaseLetter[random]);
    }
}
