import java.util.LinkedList;
//   Definition for singly-linked list.
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
    public int count(ListNode head){
        int count = 0;
        ListNode temp = head;
        while (temp!=null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
    public ListNode oddEvenList(ListNode head) {
    
        ListNode temp  = head;
        if(head!=null&&head.next!=null) return null;
        int count = count(head)
        for (int i = 0; i < count; i++) {
            if (temp.next!=null &&temp.next!=null) {
                if (i%2!=0) {
                    temp.next = temp.next.next;
                }
                else{
                    temp.next = temp.next.next;
                    
                }
            }
        }
    }
}

public class OddAndEvenLL {

    public static void main(String[] args) {

    }
}
