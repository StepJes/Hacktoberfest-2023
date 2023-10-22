class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class L03_CircularLinkedList {
    public static Node insertAtBegin(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        return head;
    }

    public static Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null) {
            temp.next = temp;
            return temp;
        }
        temp.next = head.next;
        head.next = temp;
        int t = head.data;
        head.data = temp.data;
        temp.data = t;
        return temp;
    }

    public static Node deleteAtBegin(Node head) {
        if (head == null)
            return null;
        if (head.next == head)
            return null;
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }

    public static Node deleteKthNode(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            return deleteAtBegin(head);
        }
        Node curr = head;
        int i = 0;
        while (i < k - 2) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public static void print(Node head) {
        if (head == null)
            return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
    }
}
