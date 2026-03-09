import java.util.Scanner;

public class M6Q9 {
    // Find the missing number from an array containing numbers from 1 to n.
    // Input:
    // n
    // n-1 numbers from 1..n (one missing)
    // Output: missing number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        long expected = (long) n * (n + 1) / 2;
        long actual = 0;
        for (int i = 0; i < n - 1; i++) actual += sc.nextLong();
        System.out.println(expected - actual);
        sc.close();
    }
}

