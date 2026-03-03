/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    int count(ListNode p,ListNode q){
        int count=1;

        while (p.next!=q) {
            p=p.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode q = head;
        ListNode p = head;
       while (q!=null) {
        q=q.next;
       }
       while (count(p, q)!=n) {
        p=p.next;
       }
       if (p.next!=null) {
                
       }

    }
}
public class RemoveNodeFromEndOfLL {
    
}
