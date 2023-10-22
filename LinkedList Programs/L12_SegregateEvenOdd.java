public class L12_SegregateEvenOdd {
    public static void main(String[] args) {
        Node head = new Node(10);
        L01_LinkedList.insertAtEnd(head, 15);
        L01_LinkedList.insertAtEnd(head, 12);
        L01_LinkedList.insertAtEnd(head, 20);
        L01_LinkedList.insertAtEnd(head, 25);
        L01_LinkedList.print(segregate(head));
    }

    private static Node segregate(Node head) {
        Node es = null;
        Node ee = null;
        Node os = null;
        Node oe = null;
        Node curr = head;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (es == null) {
                    es = ee = curr;
                } else {
                    ee.next = curr;
                    ee = ee.next;
                }
            } else {
                if (os == null) {
                    os = oe = curr;
                } else {
                    oe.next = curr;
                    oe = oe.next;
                }
            }
            curr = curr.next;

        }
        if (os == null || es == null) {
            return head;
        }
        ee.next = os;
        oe.next = null;
        return es;
    }
}
