package org.example;
import java.util.Scanner;

public class Customer {
    int customerId;
    String customerName;
    int previousReading;
    int currentReading;
    int unitsConsumed;
    int amount;

    public Customer(int customerId, String customerName, int previousReading, int currentReading) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        unitsConsumed = currentReading - previousReading;
        amount = unitsConsumed * 10;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public int getAmount() {
        return amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter customer name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter previous month reading: ");
        int previous = scanner.nextInt();
        System.out.print("Enter current month reading: ");
        int current = scanner.nextInt();
        Customer customer = new Customer(id, name, previous, current);
        System.out.println("\nCustomer ID: " + customer.getCustomerId());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Units consumed: " + customer.getUnitsConsumed());
        System.out.println("Amount to be paid: " + customer.getAmount());
    }
}
