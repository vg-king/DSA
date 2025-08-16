class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class StackLinkedList {
    Node top;

    StackLinkedList() {
        top = null;
    }

    // Push operation
    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Check if empty
    boolean isEmpty() {
        return top == null;
    }

    // Display stack elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // 30 20 10

        System.out.println("Top: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        stack.display(); // 20 10
        System.out.println("Is empty? " + stack.isEmpty()); // false
    }
}
