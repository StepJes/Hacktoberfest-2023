class Node {
    int data;
    Node prev;
    Node next;

    Node(int x) {
        data = x;
        prev = null;
        next = null;
    }
}

public class L02_DoublyLinkedList {
    public static Node insertAtBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }
        return temp;
    }

    public static Node insertAtEnd(Node head, int x) {
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static Node insertAtPos(Node head, int pos, int x) {
        Node temp = new Node(x);
        if (pos == 1) {
            temp.next = head;
            head.prev = temp;
            return temp;
        }
        Node curr = head;
        int i = 1;
        while (curr.next != null && i < pos - 2) {
            curr = curr.next;
            i++;
        }
        temp.next = curr.next;
        curr.next.prev = temp;
        curr.next = temp;
        temp.prev = curr;
        return head;
    }

    public static Node deleteAtBegin(Node head) {
        if (head == null)
            return head;
        if (head.next == null)
            return null;
        head = head.next;
        head.prev = null;
        return head;
    }

    public static Node deleteAtEnd(Node head) {
        if (head == null)
            return head;
        if (head.next == null)
            return null;
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
        }
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node temp = null;
        Node curr = head;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }
}
