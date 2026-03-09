import java.util.Scanner;

public class M7Q6 {
    // Implement Insertion Sort and explain its advantage for nearly sorted arrays.
    static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Input:
        // n
        // a1..an
        // Output: sorted array + note
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        insertionSort(a);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(' ');
            out.append(a[i]);
        }
        System.out.println(out);
        System.out.println("Insertion Sort advantage: if array is nearly sorted, inner shifts are small → close to O(n) time. Worst/avg O(n^2), space O(1), stable.");
        sc.close();
    }
}

