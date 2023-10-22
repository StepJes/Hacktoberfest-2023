public class L08_RemoveDuplicates {
    public static void main(String[] args) {
        Node head = new Node(10);
        L01_LinkedList.insertAtEnd(head, 15);
        L01_LinkedList.insertAtEnd(head, 12);
        L01_LinkedList.insertAtEnd(head, 20);
        L01_LinkedList.insertAtEnd(head, 25);
        L01_LinkedList.print(removeDuplicates(head));
    }

    private static Node removeDuplicates(Node head) {
        if (head == null)
            return head;
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
        return head;
    }
}
