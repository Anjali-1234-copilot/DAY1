import java.util.HashMap;
import java.util.Scanner;

public class M6Q5 {
    // Solve the Two Sum problem using optimized approach.
    // Return indices of the two numbers (0-indexed) whose sum equals target.
    // Input:
    // n
    // a1..an
    // target
    // Output: i j (or -1 -1 if not found)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();

        HashMap<Integer, Integer> firstIndex = new HashMap<>();
        int ansI = -1, ansJ = -1;
        for (int i = 0; i < n; i++) {
            int need = target - a[i];
            Integer j = firstIndex.get(need);
            if (j != null) {
                ansI = j;
                ansJ = i;
                break;
            }
            firstIndex.putIfAbsent(a[i], i);
        }
        System.out.println(ansI + " " + ansJ);
        sc.close();
    }
}

