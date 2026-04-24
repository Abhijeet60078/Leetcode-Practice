import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ListNode head = null, tail = null;
        ListNode[] nodes = new ListNode[n];

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            nodes[i] = new ListNode(val);
            if (head == null) {
                head = tail = nodes[i];
            } else {
                tail.next = nodes[i];
                tail = nodes[i];
            }
        }

        int pos = sc.nextInt();

        if (pos >= 0 && pos < n) {
            tail.next = nodes[pos];
        }

        System.out.println(hasCycle(head));
    }
}