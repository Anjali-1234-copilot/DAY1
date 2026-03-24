import java.util.*;

public class M9Q5 {
    // LeetCode 22 – Generate Parentheses
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    private static void backtrack(List<String> list, String str, int open, int close, int max) {
        if (str.length() == max * 2) {
            list.add(str);
            return;
        }
        if (open < max) backtrack(list, str + "(", open + 1, close, max);
        if (close < open) backtrack(list, str + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            List<String> res = generateParenthesis(n);
            for (String s : res) {
                System.out.println(s);
            }
        }
        sc.close();
    }
}
