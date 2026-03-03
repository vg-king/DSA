import java.util.HashMap;
class Node{
    int val;
    int key;
    Node next;
    Node prev;
    Node(int val,int key){
        this.val=val;
        this.key = key;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    int cap;
    HashMap<Integer,Node> cahce;
    Node left;
    Node right;
    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cahce = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }
    void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }
    public int get(int key) {
        if (cahce.containsKey(key)) {
            Node node = cahce.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    void put(int key,int value){
        if (cahce.containsKey(key)) {
            remove(cahce.get(key));
        }
        Node newNode = new Node(key, value);
        cahce.put(key, newNode);
        insert(newNode);
        if (cahce.size()>cap) {
            Node lru = this.left.next;
            remove(lru);
            cahce.remove(lru.key);
        }
    }
    
   
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
public class LruCacheLL {
    
}
