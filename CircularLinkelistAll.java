import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = this; // Circular reference
    }
}

class CircularLinkedList {
    private Node head = null;

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            newNode.next = head;
            last.next = newNode;
            head = newNode;
        }
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = head;
        }
    }

    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != head; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void deleteAtFirst() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
        } else {
            Node last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
        }
    }

    public void deleteAtLast() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != head) {
            current = current.next;
        }
        current.next = head;
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            deleteAtFirst();
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != head; i++) {
            current = current.next;
        }
        if (current.next != head) {
            current.next = current.next.next;
        }
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.println("Element: " + temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public int countNodes() {
        if (head == null) return 0;
        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    public boolean search(int key) {
        if (head == null) return false;
        Node temp = head;
        do {
            if (temp.data == key) return true;
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public void reverse() {
        if (head == null || head.next == head) return;

        Node prev = null;
        Node current = head;
        Node next;
        Node last = head;

        do {
            last = last.next;
        } while (last.next != head);

        Node start = head;
        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } while (current != head);

        head.next = prev;
        head = prev;
        last.next = head;
    }
}

// ...existing code...

public class CircularLinkelistAll {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice, data, index;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at Index");
            System.out.println("3. Insert at Last");
            System.out.println("4. Delete at First");
            System.out.println("5. Delete at Index");
            System.out.println("6. Delete at Last");
            System.out.println("7. Count Nodes");
            System.out.println("8. Reverse List");
            System.out.println("9. Search Element");
            System.out.println("10. Traverse List");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertAtFirst(data);
                    break;
                case 2:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertAtIndex(index, data);
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    list.insertAtLast(data);
                    break;
                case 4:
                    list.deleteAtFirst();
                    break;
                case 5:
                    System.out.print("Enter index: ");
                    index = sc.nextInt();
                    list.deleteAtIndex(index);
                    break;
                case 6:
                    list.deleteAtLast();
                    break;
                case 7:
                    System.out.println("Total Nodes: " + list.countNodes());
                    break;
                case 8:
                    list.reverse();
                    System.out.println("List reversed.");
                    break;
                case 9:
                    System.out.print("Enter value to search: ");
                    data = sc.nextInt();
                    boolean found = list.search(data);
                    System.out.println(found ? "Element found" : "Element not found");
                    break;
                case 10:
                    list.traverse();
                    break;
                case 11:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 11);
    }
}