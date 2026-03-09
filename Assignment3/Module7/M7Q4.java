import java.util.Scanner;

public class M7Q4 {
    // Implement Bubble Sort and analyze its time complexity.
    static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) break; // best-case optimization
        }
    }

    public static void main(String[] args) {
        // Input:
        // n
        // a1..an
        // Output: sorted array + time complexity note
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        bubbleSort(a);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(' ');
            out.append(a[i]);
        }
        System.out.println(out);
        System.out.println("Time Complexity: Best O(n) with swap-flag, Average/Worst O(n^2). Space: O(1).");
        sc.close();
    }
}

