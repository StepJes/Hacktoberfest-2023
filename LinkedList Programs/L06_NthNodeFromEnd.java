public class L06_NthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        L01_LinkedList.insertAtEnd(head, 5);
        L01_LinkedList.insertAtEnd(head, 20);
        L01_LinkedList.insertAtEnd(head, 15);
        L01_LinkedList.insertAtEnd(head, 25);
        System.out.println(myNode(head, 2));
    }

    private static int myNode(Node head, int n) {
        if (head == null)
            return -1;
        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return -1;
            first = first.next;
        }
        Node second = head;
        while (first != null) {
            second = second.next;
            first = first.next;
        }
        return second.data;
    }
}
