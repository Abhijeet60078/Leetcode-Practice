import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
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

        int pos = sc.nextInt();

        ListNode temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }

        deleteNode(temp);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}