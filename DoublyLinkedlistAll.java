import java.util.Scanner;

class DoublyLinkedList {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    // Traverse the list
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Element = " + temp.data);
            temp = temp.next;
        }
    }

    // Create list with initial elements
    public void createList(Scanner sc) {
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of nodes.");
            return;
        }

        System.out.print("Enter number to be inserted: ");
        int data = sc.nextInt();
        head = new Node(data);
        Node temp = head;

        for (int i = 2; i <= n; i++) {
            System.out.print("Enter number to be inserted: ");
            data = sc.nextInt();
            Node newNode = new Node(data);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
    }

    // Insert at first
    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) head.prev = newNode;

        head = newNode;
    }

    // Insert at specific index
    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertAtFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            insertAtLast(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null)
            temp.next.prev = newNode;

        temp.next = newNode;
    }

    // Insert at last
    public void insertAtLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (head == null) return;

        if (index == 0) {
            deleteAtFirst();
            return;
        }

        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.prev == null) return;

        temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }

    // Delete at first
    public void deleteAtFirst() {
        if (head == null) return;

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) temp = temp.next;

        if (temp.prev != null)
            temp.prev.next = null;
        else
            head = null; // only one node
    }
}

// filepath: c:\Users\KIIT0001\Documents\StriverDsa\DoublyLinkedlistAll.java
public class DoublyLinkedlistAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.createList(sc);
        System.out.println("The linked list is:");
        dll.traverse();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Insert at specific index");
            System.out.println("2 - Insert at first");
            System.out.println("3 - Insert at last");
            System.out.println("4 - Delete at specific index");
            System.out.println("5 - Delete at first");
            System.out.println("6 - Delete at last");
            System.out.println("7 - Traverse");
            System.out.println("8 - Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            int index, data;
            switch (choice) {
                case 1:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();
                    System.out.print("Enter element: ");
                    data = sc.nextInt();
                    dll.insertAtIndex(index, data);
                    break;
                case 2:
                    System.out.print("Enter element: ");
                    data = sc.nextInt();
                    dll.insertAtFirst(data);
                    break;
                case 3:
                    System.out.print("Enter element: ");
                    data = sc.nextInt();
                    dll.insertAtLast(data);
                    break;
                case 4:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();
                    dll.deleteAtIndex(index);
                    break;
                case 5:
                    dll.deleteAtFirst();
                    break;
                case 6:
                    dll.deleteAtEnd();
                    break;
                case 7:
                    dll.traverse();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}