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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        fast.next = head.next;
        head.next=fast;
        fast = fast.next;
        while (fast.next != slow) {
           fast.next=slow.next;
           fast=fast.next;

        }

    }
}
public class ReorderLinkedList {
    
}
