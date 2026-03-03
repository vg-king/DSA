


import java.util.HashMap;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node p = head;
        while (p!=null) {
            map.put(p, new Node(p.val));
            p=p.next;
        }
        Node temp = head;
        while (temp!=null) {
            Node copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);
            temp=temp.next;
        }
        return map.get(head);
    }
}