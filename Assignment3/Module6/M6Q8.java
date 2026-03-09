import java.util.HashMap;
import java.util.Scanner;

public class M6Q8 {
    // Find the longest subarray with sum equal to k.
    // Input:
    // n
    // a1..an
    // k
    // Output: length of longest subarray with sum k
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        long k = sc.nextLong();

        HashMap<Long, Integer> firstPos = new HashMap<>();
        firstPos.put(0L, -1);
        long sum = 0;
        int best = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            firstPos.putIfAbsent(sum, i);
            Integer j = firstPos.get(sum - k);
            if (j != null) best = Math.max(best, i - j);
        }
        System.out.println(best);
        sc.close();
    }
}

