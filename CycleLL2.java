import java.util.HashMap;
import java.util.Map;

public class CycleLL2 {
    
//  Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
        val = x;
         next = null;
    }
 }
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        Map<ListNode,Integer> mpp = new HashMap<>();
        while(temp!=null){
            if(mpp.containsKey(temp)){
                return temp;
            }
            mpp.put(temp,1);
            temp = temp.next;
        }
        return temp;
        
    }
}
    public static void main(String[] args) {
        
    }
}
