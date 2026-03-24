public class M7Q10 {
    // Compare time and space complexity of Bubble, Selection, Insertion, Merge, and Quick sort.
    public static void main(String[] args) {
        System.out.println("Algorithm   | Best Time | Avg Time  | Worst Time | Extra Space | Stable?");
        System.out.println("------------+-----------+-----------+------------+-------------+--------");
        System.out.println("Bubble      | O(n)*     | O(n^2)    | O(n^2)     | O(1)        | Yes");
        System.out.println("Selection   | O(n^2)    | O(n^2)    | O(n^2)     | O(1)        | No");
        System.out.println("Insertion   | O(n)      | O(n^2)    | O(n^2)     | O(1)        | Yes");
        System.out.println("Merge       | O(n logn) | O(n logn) | O(n logn)  | O(n)        | Yes");
        System.out.println("Quick       | O(n logn) | O(n logn) | O(n^2)     | O(logn)**   | No");
        System.out.println();
        System.out.println("* Bubble best-case O(n) only if we use early-exit (swap flag).");
        System.out.println("** Quick extra space is recursion stack: avg O(log n), worst O(n).");
    }
}

