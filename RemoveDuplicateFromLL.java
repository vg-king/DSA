
//  * Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp1 = head;
        ListNode temp2 = head;
        while(temp1!=null){
            if(temp1.val!=temp1.next.val){
                temp1 = temp1.next;
            }else{
                temp2 = temp1.next;
                while(temp2!=null){
                    if(temp2.val!=temp1.val){
                        temp1.next = temp2;
                        break;
                    }
                    else{
                        temp2 = temp2.next;
                    }
                }
            }

        }
        return head;
    }
}
public class RemoveDuplicateFromLL {
    public static void main(String[] args) {
        Math.pow(0, 0);
    }
}
