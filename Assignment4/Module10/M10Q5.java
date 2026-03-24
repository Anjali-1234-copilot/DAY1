import java.util.Scanner;

public class M10Q5 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    // LeetCode 2 – Add Two Numbers
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            ListNode dummy1 = new ListNode(0);
            ListNode curr1 = dummy1;
            for (int i = 0; i < n; i++) {
                curr1.next = new ListNode(sc.nextInt());
                curr1 = curr1.next;
            }
            int m = sc.nextInt();
            ListNode dummy2 = new ListNode(0);
            ListNode curr2 = dummy2;
            for (int i = 0; i < m; i++) {
                curr2.next = new ListNode(sc.nextInt());
                curr2 = curr2.next;
            }
            ListNode res = addTwoNumbers(dummy1.next, dummy2.next);
            while (res != null) {
                System.out.print(res.val + " ");
                res = res.next;
            }
            System.out.println();
        }
        sc.close();
    }
}
