class ListNode {
    int val;
    ListNode next;

    public ListNode(int data) {
        this.val = data;
        this.next = null;
    }
}

class Solution {
    public ListNode removeTarget(ListNode head, int target) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val == target) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}

public class Main {
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(4);

        int target = 2;

        Solution sol = new Solution();
        ListNode result = sol.removeTarget(head, target);

        printList(result);
    }

    public static void printList(ListNode head) {
        System.out.print("head → ");
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print("-");
            head = head.next;
        }
        System.out.println();
    }
}
