// Module 1 - Q5
// Find the sum of all even numbers between 1 and 100 using a while loop.

public class Module1_Q5 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum of all even numbers between 1 and 100 is: " + sum);
    }
}

