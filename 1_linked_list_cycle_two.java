import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class 1_linked_list_cycle_two{
    public static ListNode detectCycle(ListNode head){
        if(head==null||head.next==null)return null;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),pos=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        ListNode head=new ListNode(arr[0]),temp=head,cycleNode=null;
        if(pos==0)cycleNode=head;
        for(int i=1;i<n;i++){
            temp.next=new ListNode(arr[i]);
            temp=temp.next;
            if(i==pos)cycleNode=temp;
        }
        if(pos!=-1)temp.next=cycleNode;
        ListNode res=detectCycle(head);
        
    }
}