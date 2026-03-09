import java.util.Scanner;

public class M6Q2 {
    // Construct a Prefix Sum array and answer multiple range sum queries.
    // Input:
    // n
    // a1..an
    // q
    // l r  (0-indexed, inclusive) repeated q times
    //
    // Output: sum for each query
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        long[] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            long x = sc.nextLong();
            pref[i] = pref[i - 1] + x;
        }

        int q = sc.nextInt();
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long sum = pref[r + 1] - pref[l];
            out.append(sum).append('\n');
        }
        System.out.print(out);
        sc.close();
    }
}

