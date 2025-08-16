class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);

        ListNode curr = head;
        int carry = 0;
        ListNode prev = null;

        while (curr != null) {
            int doubled = curr.val * 2 + carry;
            curr.val = doubled % 10;
            carry = doubled / 10;
            prev = curr;
            curr = curr.next;
        }

        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
}

public class DoubleValInLL {
    public static void main(String[] args) {
     
        ListNode n3 = new ListNode(3);
        ListNode n2 = new ListNode(2); n2.next = n3;
        ListNode n1 = new ListNode(1); n1.next = n2;

        Solution sol = new Solution();
        ListNode result = sol.doubleIt(n1);

        System.out.print("[");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(", ");
            result = result.next;
        }
        System.out.println("]");
    }
}