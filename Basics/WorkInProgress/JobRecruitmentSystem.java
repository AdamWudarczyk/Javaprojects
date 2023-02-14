package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JobRecruitmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<JobPosting> jobPostings = new ArrayList<>();

        while (true) {
            System.out.println("Job Recruitment System");
            System.out.println("1. Post Job");
            System.out.println("2. View Job Postings");
            System.out.println("3. Apply for Job");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter job title:");
                    String title = scanner.nextLine();

                    System.out.println("Enter job description:");
                    String description = scanner.nextLine();

                    System.out.println("Enter job location:");
                    String location = scanner.nextLine();

                    System.out.println("Enter job salary:");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // consume the newline character

                    jobPostings.add(new JobPosting(title, description, location, salary));
                    System.out.println("Job posted successfully");
                    break;
                case 2:
                    for (JobPosting jobPosting : jobPostings) {
                        System.out.println(jobPosting);
                    }
                    break;
                case 3:
                    System.out.println("Enter your name:");
                    String name = scanner.nextLine();

                    System.out.println("Enter your email:");
                    String email = scanner.nextLine();

                    System.out.println("Enter your phone number:");
                    String phoneNumber = scanner.nextLine();

                    System.out.println("Enter job title to apply for:");
                    String jobTitle = scanner.nextLine();

                    for (JobPosting jobPosting : jobPostings) {
                        if (jobPosting.getTitle().equalsIgnoreCase(jobTitle)) {
                            jobPosting.apply(name, email, phoneNumber);
                            System.out.println("Job application submitted successfully");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting Job Recruitment System");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

class JobPosting {
    private String title;
    private String description;
    private String location;
    private double salary;
    private List<JobApplication> jobApplications = new ArrayList<>();

    public JobPosting(String title, String description, String location, double salary) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }

    public List<JobApplication> getJobApplications() {
        return jobApplications;
    }

    public void apply(String name, String email, String phoneNumber) {
        JobApplication jobApplication = new JobApplication(name, email, phoneNumber, new Date());
        jobApplications.add(jobApplication);
    }

    @Override
    public String toString() {
        return "JobPosting{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class JobApplication {
    private String name;
    private String email;
    private String phoneNumber;
    private Date dateApplied;

    public JobApplication(String name, String email, String phoneNumber, Date dateApplied) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
