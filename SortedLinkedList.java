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
    public ListNode split(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp=slow.next;
        return temp;
    }
    public ListNode merge(ListNode first,ListNode second){
        if(first==null) return second;
        if(second==null) return first;
        if(first.val<second.val){
            first.next = merge(first.next,second);
            return first;
        }
        else{
            second.next = merge(first,second.next);
            return second;
        }
    }
    public ListNode mergesort(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode second = split(head);
        head = mergesort(head);
        second = mergesort(second);

        return merge(head,second);
    }
    public ListNode sortList(ListNode head) {
       return mergesort(head);
    }
}
public class SortedLinkedList {
 public static void main(String[] args) {
    
 }   
}
