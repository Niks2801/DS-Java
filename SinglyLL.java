import java.io.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class SinglyLL {
    Node head;

    // Method to insert a new node with value x into the linked list
    SinglyLL insert(SinglyLL L1, int x) {
        Node a = new Node(x); // Corrected 'node' to 'Node'
        if (L1.head == null) { // Removed the semicolon after the if statement
            L1.head = a;
        } else {
            Node p = L1.head;
            while (p.next != null) { // Removed the semicolon after the while statement
                p = p.next;
            }
            p.next = a;
        }
        return L1; // Return the updated list
    }

    // Method to print the linked list
    public void print() {
        Node Start = head; // Use 'head' directly
        while (Start != null) { // Changed condition to check for null
            System.out.print(Start.data + "-> ");
            Start = Start.next;
        }
        System.out.println(); // Print a new line after printing the list
    }

    public static void main(String[] args) {
        SinglyLL L1 = new SinglyLL(); // Corrected class name to 'SinglyLL'
        L1 = L1.insert(L1, 10); // Corrected the method call
        L1 = L1.insert(L1, 20); // Corrected the method call
        L1.print(); // Corrected the method call
    }
}