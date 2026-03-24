import java.util.Scanner;

public class M7Q7 {
    // Implement Merge Sort using divide and conquer.
    static void mergeSort(int[] a) {
        if (a.length <= 1) return;
        int[] tmp = new int[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
    }

    static void mergeSort(int[] a, int[] tmp, int l, int r) {
        if (l >= r) return;
        int mid = l + (r - l) / 2;
        mergeSort(a, tmp, l, mid);
        mergeSort(a, tmp, mid + 1, r);
        merge(a, tmp, l, mid, r);
    }

    static void merge(int[] a, int[] tmp, int l, int mid, int r) {
        int i = l, j = mid + 1, k = l;
        while (i <= mid && j <= r) {
            if (a[i] <= a[j]) tmp[k++] = a[i++]; // <= keeps stability
            else tmp[k++] = a[j++];
        }
        while (i <= mid) tmp[k++] = a[i++];
        while (j <= r) tmp[k++] = a[j++];
        for (int p = l; p <= r; p++) a[p] = tmp[p];
    }

    public static void main(String[] args) {
        // Input:
        // n
        // a1..an
        // Output: sorted array
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        mergeSort(a);
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(' ');
            out.append(a[i]);
        }
        System.out.println(out);
        sc.close();
    }
}

