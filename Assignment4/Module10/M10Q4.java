import java.util.Scanner;

public class M10Q4 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    // LeetCode 19 – Remove Nth Node From End of List
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int len = sc.nextInt();
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            for (int i = 0; i < len; i++) {
                curr.next = new ListNode(sc.nextInt());
                curr = curr.next;
            }
            int n = sc.nextInt();
            ListNode res = removeNthFromEnd(dummy.next, n);
            while (res != null) {
                System.out.print(res.val + " ");
                res = res.next;
            }
            System.out.println();
        }
        sc.close();
    }
}
