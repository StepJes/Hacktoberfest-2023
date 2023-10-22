
class L01_LinkedList {
    public static Node insertAtBegin(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    public static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = temp;
        return temp;
    }

    public static Node insertAtPos(Node head, int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return head;
        }
        Node curr = head;
        for (int i = 1; (i < pos - 2) && (curr != null); i++) {
            curr = curr.next;
        }
        if (curr == null)
            return head;
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }

    public static void print(Node head) {
        Node curr = head;
        System.out.print("[ ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.print("]");
    }

    public static Node deleteAtBegin(Node head) {
        if (head == null)
            return null;
        else
            return head.next;
    }

    public static Node deleteAtEnd(Node head) {
        if (head == null)
            return null;
        if (head.next == null)
            return null;
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static int search(Node head, int x) {
        int pos = 1;
        Node curr = head;
        while (curr != null) {
            if (curr.data == x)
                return pos;
            else {
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }

}