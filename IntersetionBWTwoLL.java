
//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public int counter(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp!=null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int countA = counter(headA);
        int countB = counter(headB);
        int totalDis;
        if (countA>countB) {
            totalDis = countA-countB;
        }else{
            totalDis = countB-countA;
        }
        while (totalDis!=0) {
            if (countA>countB) {
                temp1 = temp1.next;
                totalDis--;
            }else{
                temp2 = temp2.next;
                totalDis--;
            }
        }
        // if (temp1==null&&temp1.next==null) {
        while (temp1!=null&&temp2!=null) {
            if (temp1==temp2) {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
            
        // }
        return null;
    }
}

public class IntersetionBWTwoLL {
    public static void main(String[] args) {

    }
}
