import java.util.Scanner;

public class M8Q1 {
    // LeetCode 242 – Valid Anagram
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] map = new int[26];
        for (char c : s.toCharArray()) map[c - 'a']++;
        for (char c : t.toCharArray()) {
            if (map[c - 'a'] == 0) return false;
            map[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            if (sc.hasNext()) {
                String t = sc.next();
                System.out.println(isAnagram(s, t));
            }
        }
        sc.close();
    }
}
