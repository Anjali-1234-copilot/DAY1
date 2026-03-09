import java.util.Scanner;

public class M6Q10 {
    // Rearrange an array so that even index contains even numbers.
    // Assumption (typical problem constraint): array has equal count of even and odd numbers.
    // Input:
    // n (even)
    // a1..an
    // Output: rearranged array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int evenIdx = 0;
        int oddIdx = 1;
        while (evenIdx < n && oddIdx < n) {
            while (evenIdx < n && a[evenIdx] % 2 == 0) evenIdx += 2;
            while (oddIdx < n && a[oddIdx] % 2 != 0) oddIdx += 2;
            if (evenIdx < n && oddIdx < n) {
                int tmp = a[evenIdx];
                a[evenIdx] = a[oddIdx];
                a[oddIdx] = tmp;
            }
        }

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) out.append(' ');
            out.append(a[i]);
        }
        System.out.println(out);
        sc.close();
    }
}

