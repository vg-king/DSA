import java.util.ArrayList;
import java.util.List;
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    ListNode Reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next ;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
        return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = Reverse(l1);
        l2 = Reverse(l2);
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        List<Integer>list3 = new ArrayList<>();
        ListNode p = l1;
        while (p!=null) {
            list1.add(p.val);
            p=p.next;
        }
        ListNode q = l2;
        while (q!=null) {
            list2.add(q.val);
            q=q.next;
        }
        int n = Math.max(list1.size(), list2.size());
        int carry=0;
        for (int i = 0; i < n; i++) {
            int val1 = (i<list1.size())?list1.get(i):0;
            int val2 = (i<list2.size())?list2.get(i):0;
            int sum = val1+val2+carry;
            list3.add(sum%10);
            carry=sum/10;
        }

        if (carry>0) {
            list3.add(carry);
        }
        ListNode dummy = new ListNode();
        ListNode temp  = dummy;
        for (int i = 0; i < list3.size(); i++) {
            temp.next = new ListNode(list3.get(i));
            temp = temp.next;
        }
        return Reverse(dummy.next);
    }
}
public class AddTwoNumberInLL {
    
}
