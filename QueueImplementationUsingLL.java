class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Queue { 
    Node front = null;
    Node rear = null;
    int size = 0;

    public void enqueue(int x) {
        Node temp = new Node(x);
        if (size == 0) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.val;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int x = front.val;
        front = front.next;
        size--;
        if (size == 0) rear = null;
        return x;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class QueueImplementationUsingLL {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.peek());
    }
}
