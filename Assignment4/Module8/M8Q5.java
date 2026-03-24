import java.util.Scanner;

public class M8Q5 {
    // LeetCode 191 – Number of 1 Bits
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.println(hammingWeight(n));
        }
        sc.close();
    }
}
