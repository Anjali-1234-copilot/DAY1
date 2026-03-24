import java.util.Scanner;

public class M7Q1 {
    // Implement Binary Search iteratively and recursively.
    static int binarySearchIter(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == key) return mid;
            if (a[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    static int binarySearchRec(int[] a, int l, int r, int key) {
        if (l > r) return -1;
        int mid = l + (r - l) / 2;
        if (a[mid] == key) return mid;
        if (a[mid] < key) return binarySearchRec(a, mid + 1, r, key);
        return binarySearchRec(a, l, mid - 1, key);
    }

    public static void main(String[] args) {
        // Input:
        // n
        // sorted a1..an
        // key
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int key = sc.nextInt();

        int i1 = binarySearchIter(a, key);
        int i2 = binarySearchRec(a, 0, n - 1, key);
        System.out.println(i1);
        System.out.println(i2);
        sc.close();
    }
}

