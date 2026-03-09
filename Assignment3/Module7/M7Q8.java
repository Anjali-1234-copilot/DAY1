import java.util.Scanner;

public class M7Q8 {
    // Implement Quick Sort and explain pivot partition logic.
    static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    static void quickSort(int[] a, int l, int r) {
        if (l >= r) return;
        int p = partition(a, l, r); // after partition, a[p] is in correct place
        quickSort(a, l, p - 1);
        quickSort(a, p + 1, r);
    }

    // Lomuto partition: choose last element as pivot.
    // All elements <= pivot are moved to the left side, others to right side.
    static int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l; // i is the first index of "greater than pivot" region
        for (int j = l; j < r; j++) {
            if (a[j] <= pivot) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
            }
        }
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;
        return i;
    }

    public static void main(String[] args) {
        // Input:
        // n
        // a1..an
        // Output: sorted array + pivot logic note
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        quickSort(a);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(' ');
            out.append(a[i]);
        }
        System.out.println(out);
        System.out.println("Pivot partition (Lomuto): pick last element as pivot; scan j, grow i for <=pivot region; finally swap pivot into index i.");
        sc.close();
    }
}

