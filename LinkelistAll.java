import java.util.Scanner;
import java.util.LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListcustom {
    private Node head;

    // Insert at beginning
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at index
    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertAtFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid index!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Insert at end
    public void insertAtLast(int data) {
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

    // Delete first
    public void deleteAtFirst() {
        if (head == null) return;
        head = head.next;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteAtFirst();
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Invalid index!");
            return;
        }

        temp.next = temp.next.next;
    }

    // Delete last
    public void deleteAtLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    // Count nodes
    public int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Reverse linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Search
    public int search(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Element = " + temp.data);
            temp = temp.next;
        }
    }
}
public class LinkelistAll {

    public static void main(String[] args) {
          LinkedListcustom linkedListcustom = new LinkedListcustom();
          linkedListcustom.insertAtFirst(0);
          linkedListcustom.insertAtFirst(10);
          linkedListcustom.insertAtFirst(21);
          linkedListcustom.insertAtFirst(13);
          linkedListcustom.display();
    }
}