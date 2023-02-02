package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int target = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter your guess (1-100): ");
            guess = scanner.nextInt();
            if (guess < target) {
                System.out.println("Too low! Try again.");
            } else if (guess > target) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != target);
        System.out.println("You got it! The number was " + target + ".");
    }
}
