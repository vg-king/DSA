class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Queue{
    Node front = null;
    Node rear = null;
    int size = 0;

    public void enqueue(int val){
        Node node = new Node(val);
        if (size==0) {
            front=rear=node;
        }
        else{
            rear.next = node;
            rear = node;
            rear.next = front;
        }
        size++;
    }
    public int peek() throws Exception{
        if (size==0) {
            throw new Exception("Queue is Empty");

        }
        return front.val;
    }
    public int dequeue()throws Exception {
        if (size==0) {
            throw new Exception("Queue is empty");
            
        }
        else{
            int x = front.val;
            front = front.next;
            size--;
            return x;
        }

    }
    public void display()throws Exception {
        if (size==0) {
            throw new Exception("Queue is Empty");
        }
        Node temp = front;
        while (temp!=rear) {
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println(temp.val);
        System.out.println();
    }
    public boolean isEmpty(){
        if (size==0) {
            return true;
        }
        return false;
    }

}
public class CircularQueueLL {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(1);
        queue.display();
    }
}
