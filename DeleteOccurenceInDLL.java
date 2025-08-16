// Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 

class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp2!=null){
            if(temp2.val != target){
                temp1 = temp2.next;
                while(temp1!=null){
                    if(temp1.val!= target){
                        temp1.prev = temp2;
                    }
                    else{
                        temp1 = temp1.next;
                    }
                }
            }
            else{
                temp2 = temp2.next;
            }
        }
        return head;
    }
}

public class DeleteOccurenceInDLL {
    
}
