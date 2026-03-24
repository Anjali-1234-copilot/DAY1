import java.util.Scanner;

public class M10Q2 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    // LeetCode 141 – Linked List Cycle
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            for (int i = 0; i < n; i++) {
                curr.next = new ListNode(sc.nextInt());
                curr = curr.next;
            }
            int pos = sc.nextInt();
            if (pos != -1) {
                ListNode cycleNode = dummy.next;
                for (int i = 0; i < pos; i++) {
                    cycleNode = cycleNode.next;
                }
                curr.next = cycleNode;
            }
            System.out.println(hasCycle(dummy.next));
        }
        sc.close();
    }
}
