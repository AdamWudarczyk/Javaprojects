package org.example;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> passwords = new HashMap<>();
        boolean running = true;
        while (running) {
            System.out.println("\nPassword Manager");
            System.out.println("1. Add a new password");
            System.out.println("2. View a password");
            System.out.println("3. Update a password");
            System.out.println("4. Delete a password");
            System.out.println("5. Quit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter website name: ");
                    String website = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    passwords.put(website, password);
                    System.out.println("Password added.");
                    break;
                case 2:
                    System.out.print("Enter website name: ");
                    website = scanner.nextLine();
                    if (passwords.containsKey(website)) {
                        System.out.println("Password for " + website + ": " + passwords.get(website));
                    } else {
                        System.out.println("Website not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter website name: ");
                    website = scanner.nextLine();
                    if (passwords.containsKey(website)) {
                        System.out.print("Enter new password: ");
                        password = scanner.nextLine();
                        passwords.put(website, password);
                        System.out.println("Password updated.");
                    } else {
                        System.out.println("Website not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter website name: ");
                    website = scanner.nextLine();
                    if (passwords.containsKey(website)) {
                        passwords.remove(website);
                        System.out.println("Password deleted.");
                    } else {
                        System.out.println("Website not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting password manager...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
