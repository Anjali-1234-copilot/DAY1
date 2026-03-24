import java.util.HashSet;
import java.util.Scanner;

public class M6Q4 {
    // Find all pairs in an array whose sum equals a target value.
    // Input:
    // n
    // a1..an
    // target
    // Output: each pair (x y) on new line (x is the current value, y is the needed complement seen before)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();

        HashSet<Integer> seen = new HashSet<>();
        StringBuilder out = new StringBuilder();
        for (int x : a) {
            int need = target - x;
            if (seen.contains(need)) {
                out.append(need).append(' ').append(x).append('\n');
            }
            seen.add(x);
        }
        System.out.print(out);
        sc.close();
    }
}

