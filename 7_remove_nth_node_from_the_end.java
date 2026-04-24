import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int m = 0;

        while (temp != null) {
            m++;
            temp = temp.next;
        }

        if (n == m) return head.next;

        int pos = m - n;

        temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ListNode head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        int k = sc.nextInt();

        head = removeNthFromEnd(head, k);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}