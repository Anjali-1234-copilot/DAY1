import java.util.Scanner;

public class M6Q6 {
    // Find the majority element using Boyer–Moore Voting Algorithm.
    // Majority element appears more than n/2 times.
    // Input:
    // n
    // a1..an
    // Output: majority element if exists, else -1
    static int majorityElement(int[] a) {
        int cand = 0, cnt = 0;
        for (int x : a) {
            if (cnt == 0) {
                cand = x;
                cnt = 1;
            } else if (x == cand) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int freq = 0;
        for (int x : a) if (x == cand) freq++;
        return freq > a.length / 2 ? cand : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(majorityElement(a));
        sc.close();
    }
}

