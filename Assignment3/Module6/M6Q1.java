import java.util.Scanner;

public class M6Q1 {
    // Find the maximum subarray sum using Kadane’s Algorithm.
    static long kadaneMaxSubarraySum(int[] a) {
        long best = Long.MIN_VALUE;
        long cur = 0;
        for (int x : a) {
            cur = Math.max((long) x, cur + x);
            best = Math.max(best, cur);
        }
        return best;
    }

    public static void main(String[] args) {
        // Input:
        // n
        // a1 a2 ... an
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(kadaneMaxSubarraySum(a));
        sc.close();
    }
}

