// Module 1 - Q1
// Check if a given number is positive, negative, or zero.

import java.util.Scanner;

public class Module1_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("The number is Positive.");
        } else if (n < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}

