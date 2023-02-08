package org.example;
import java.util.Scanner;

public class Student {
    int studentId;
    String studentName;
    int totalClasses;
    int attendedClasses;

    public Student(int studentId, String studentName, int totalClasses, int attendedClasses) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public int getPercentageAttended() {
        return (attendedClasses * 100) / totalClasses;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter total number of classes: ");
        int total = scanner.nextInt();
        System.out.print("Enter number of classes attended: ");
        int attended = scanner.nextInt();
        Student student = new Student(id, name, total, attended);
        System.out.println("\nStudent ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Percentage of classes attended: " + student.getPercentageAttended() + "%");
    }
}
