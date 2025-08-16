public class StackArray {
    int[] stack;
    int top;
    int size;

    // Constructor
    StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    // Push
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Pop
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // Check if empty
    boolean isEmpty() {
        return top == -1;
    }

    // ✅ Check if full
    boolean isFull() {
        return top == size - 1;
    }

    // Main method
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Is stack full? " + stack.isFull()); // true

        stack.push(20); // This will show overflow

        System.out.println("Top: " + stack.peek()); // 15
        stack.pop();
        System.out.println("Is stack full? " + stack.isFull()); // false
    }
}
