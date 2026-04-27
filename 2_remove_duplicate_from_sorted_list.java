import java.util.*;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class Main{
    public static ListNode deleteDuplicates(ListNode head){
        if(head==null)return head;
        ListNode curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)return;
        ListNode head=new ListNode(sc.nextInt());
        ListNode temp=head;
        for(int i=1;i<n;i++){
            temp.next=new ListNode(sc.nextInt());
            temp=temp.next;
        }
        head=deleteDuplicates(head);
        temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        
    }
}