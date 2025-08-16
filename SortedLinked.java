import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void sortLinkedList() {
        if (head == null) return;

        Node current = head;
        while (current != null) {
            Node index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
}

public class SortedLinked {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        LinkedList l2 = new LinkedList();
        ll.insert(0);
        ll.insert(1);
        ll.insert(1);
        ll.insert(2);
        ll.insert(2);
        ll.insert(2);
        ll.insert(2);
        l2.insert(2);
        l2.insert(2);
        l2.insert(0);
        l2.insert(1);
        System.out.println("Before Sorting:");
        ll.display();
        l2.display();

        ll.sortLinkedList();
        l2.sortLinkedList();

        System.out.println("After Sorting:");
        ll.display();
        l2.display();
    }
}