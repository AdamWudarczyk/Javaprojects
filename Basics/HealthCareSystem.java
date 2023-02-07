package org.example;

import java.util.Scanner;
import java.util.ArrayList;

class Patient {
    private String name;
    private int age;
    private String illness;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }
}

class HealthcareSystem {
    private ArrayList<Patient> patients;

    public HealthcareSystem() {
        patients = new ArrayList<Patient>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayPatients() {
        System.out.println("Patient Name\tAge\tIllness");
        for (Patient patient : patients) {
            System.out.println(patient.getName() + "\t\t" + patient.getAge() + "\t" + patient.getIllness());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HealthcareSystem system = new HealthcareSystem();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1. Add Patient");
            System.out.println("2. Display Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.next();
                    System.out.print("Enter patient age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter patient illness: ");
                    String illness = sc.next();
                    Patient patient = new Patient(name, age, illness);
                    system.addPatient(patient);
                    break;
                case 2:
                    system.displayPatients();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
        sc.close();
    }
}
