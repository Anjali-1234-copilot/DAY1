import java.util.Scanner;

public class M7Q5 {
    // Implement Selection Sort and compare with Bubble Sort.
    static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) minIdx = j;
            }
            int tmp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = tmp;
        }
    }

    public static void main(String[] args) {
        // Input:
        // n
        // a1..an
        // Output: sorted array + comparison note
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        selectionSort(a);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(' ');
            out.append(a[i]);
        }
        System.out.println(out);
        System.out.println("Selection vs Bubble: Both O(n^2), but Selection does O(n) swaps (fewer writes). Bubble can be O(n) best-case and is stable; Selection is usually unstable.");
        sc.close();
    }
}

