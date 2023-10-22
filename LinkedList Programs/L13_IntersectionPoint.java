public class L13_IntersectionPoint {
    public static void main(String[] args) {
        Node head1 = new Node(5);
        L01_LinkedList.insertAtEnd(head1, 3);
        L01_LinkedList.insertAtEnd(head1, 7);
        Node head2 = new Node(9);
        Node link = L01_LinkedList.insertAtEnd(head1, 10);
        head2.next = link;
        L01_LinkedList.insertAtEnd(head1, 12);
        L01_LinkedList.insertAtEnd(head1, 15);
        System.out.println(findPoint(head1, head2));
    }

    private static int findPoint(Node head1, Node head2) {
        int count1 = 0;
        int count2 = 0;
        Node curr1 = head1;
        Node curr2 = head2;
        while (curr1 != null) {
            count1++;
            curr1 = curr1.next;
        }
        while (curr2 != null) {
            count2++;
            curr2 = curr2.next;
        }
        if (count2 > count1)
            findPoint(head2, head1);
        int diff = count1 - count2;
        curr1 = head1;
        curr2 = head2;
        while (diff != 0) {
            curr1 = curr1.next;
            diff--;
        }
        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2)
                return curr1.data;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }
}
