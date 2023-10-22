public class L16_Merge2SortedLL {
    public static void main(String[] args) {
        Node head1 = new Node(10);
        L01_LinkedList.insertAtEnd(head1, 20);
        L01_LinkedList.insertAtEnd(head1, 30);
        Node head2 = new Node(5);
        L01_LinkedList.insertAtEnd(head2, 25);
        L01_LinkedList.print(mergeLL(head1, head2));
    }

    private static Node mergeLL(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;
        Node head = null, tail = null;
        if (a.data <= b.data) {
            head = tail = a;
            a = a.next;
        } else {
            head = tail = b;
            b = b.next;
        }
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                tail = a;
                a = a.next;
            } else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if (a == null)
            tail.next = b;
        else
            tail.next = a;

        return head;
    }
}
