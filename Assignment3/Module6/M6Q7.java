import java.util.Scanner;

public class M6Q7 {
    // Partition an array so that negative numbers appear before positives.
    // (0 is treated as non-negative here)
    // Input:
    // n
    // a1..an
    // Output: partitioned array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int i = 0, j = n - 1;
        while (i <= j) {
            if (a[i] < 0) {
                i++;
            } else if (a[j] >= 0) {
                j--;
            } else {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }

        StringBuilder out = new StringBuilder();
        for (int k = 0; k < n; k++) {
            if (k > 0) out.append(' ');
            out.append(a[k]);
        }
        System.out.println(out);
        sc.close();
    }
}

