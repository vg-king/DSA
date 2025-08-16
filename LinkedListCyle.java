
public class LinkedListCyle {
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public boolean hasCycle(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;
        while(second.next!=null&&first.next.next!=null){
            second = second.next;
            first = first.next;
            if(second.next == first){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
    public static void main(String[] args) {
        
    }
}
