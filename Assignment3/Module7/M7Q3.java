import java.util.Scanner;

public class M7Q3 {
    // Search an element in a rotated sorted array.
    // Input:
    // n
    // rotated sorted a1..an (distinct elements assumed)
    // key
    // Output: index or -1
    static int searchRotated(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == key) return mid;
            if (a[l] <= a[mid]) { // left sorted
                if (a[l] <= key && key < a[mid]) r = mid - 1;
                else l = mid + 1;
            } else { // right sorted
                if (a[mid] < key && key <= a[r]) l = mid + 1;
                else r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int key = sc.nextInt();
        System.out.println(searchRotated(a, key));
        sc.close();
    }
}

