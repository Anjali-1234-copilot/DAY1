import java.util.Scanner;

public class M7Q2 {
    // Find first and last occurrence of an element using Binary Search.
    static int firstOcc(int[] a, int key) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == key) {
                ans = mid;
                r = mid - 1;
            } else if (a[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    static int lastOcc(int[] a, int key) {
        int l = 0, r = a.length - 1, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == key) {
                ans = mid;
                l = mid + 1;
            } else if (a[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Input:
        // n
        // sorted a1..an
        // key
        // Output: first last
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int key = sc.nextInt();

        System.out.println(firstOcc(a, key) + " " + lastOcc(a, key));
        sc.close();
    }
}

