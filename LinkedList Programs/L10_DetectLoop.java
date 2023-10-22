public class L10_DetectLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        L01_LinkedList.insertAtEnd(head, 15);
        L01_LinkedList.insertAtEnd(head, 12);
        L01_LinkedList.insertAtEnd(head, 20);
        L01_LinkedList.insertAtEnd(head, 25);
        System.out.println(detectLoop(head));
    }

    private static boolean detectLoop(Node head) {

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}
