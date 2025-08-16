
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

public class MiddleLL {
    public static void main(String[] args) {
        
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        Solution sol = new Solution();
        ListNode mid = sol.middleNode(n1);
       System.out.print("[");
        ListNode temp = mid;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) System.out.print(", ");
            temp = temp.next;
        }
        System.out.println("]");
    
    }
}