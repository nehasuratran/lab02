package swe;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the New York Spelling Bee!");
        System.out.println("Let's calculate your score based on the number of correctly spelled words and bonus points.");

       
        System.out.print("Enter the number of correctly spelled words: ");
        double correctWords = scanner.nextDouble();

        System.out.print("Enter your bonus points: ");
        double bonusPoints = scanner.nextDouble();

        double score = correctWords * 10 + bonusPoints;

        System.out.println("Your total score is: " + score);


        System.out.println("Thank you for participating in the New York Spelling Bee. Goodbye!");


        scanner.close();

        System.out.println("Rushil was here");
    }
}
