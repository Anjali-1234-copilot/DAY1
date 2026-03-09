// Module 1 - Q3
// Take a student's marks as input and print the corresponding
// grade (A, B, C, D, or F) using a switch statement.

import java.util.Scanner;

public class Module1_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0–100): ");
        int marks = sc.nextInt();

        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        switch (grade) {
            case 'A':
                System.out.println("Grade: A");
                break;
            case 'B':
                System.out.println("Grade: B");
                break;
            case 'C':
                System.out.println("Grade: C");
                break;
            case 'D':
                System.out.println("Grade: D");
                break;
            case 'F':
                System.out.println("Grade: F");
                break;
            default:
                System.out.println("Invalid grade");
        }

        sc.close();
    }
}

