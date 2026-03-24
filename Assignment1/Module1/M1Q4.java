// Module 1 - Q4
// Print the multiplication table of a given number using a for loop.

import java.util.Scanner;

public class Module1_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int n = sc.nextInt();

        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        sc.close();
    }
}

