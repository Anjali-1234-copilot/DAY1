import java.util.Scanner;

public class M6Q3 {
    // Implement the Difference Array technique for range updates.
    // Input:
    // n
    // initial array a1..an
    // q
    // l r val   (0-indexed, inclusive) add val to range [l,r]
    // Output final array after all updates
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();

        long[] diff = new long[n + 1];
        diff[0] = a[0];
        for (int i = 1; i < n; i++) diff[i] = a[i] - a[i - 1];

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long val = sc.nextLong();
            diff[l] += val;
            if (r + 1 < n) diff[r + 1] -= val;
        }

        StringBuilder out = new StringBuilder();
        long cur = 0;
        for (int i = 0; i < n; i++) {
            cur += diff[i];
            if (i > 0) out.append(' ');
            out.append(cur);
        }
        System.out.println(out);
        sc.close();
    }
}

