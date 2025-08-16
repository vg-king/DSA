
//   Definition for singly-linked list.

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next ;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode list = new ListNode();

        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode temp1 = l1;
        ListNode temp2 = l1;

        int total;
        while (temp1!=null&&temp2!=null) {
            total = temp1.val+temp2.val;
            list.val = total;
            temp1 = temp1.next;
            temp2 = temp2.next;
            
        }
        return temp1;

    }
}

public class AddTwoLL {
    public static void main(String[] args) {

    }
}
