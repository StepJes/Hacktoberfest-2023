public class L07_ReverseLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        L01_LinkedList.insertAtEnd(head, 5);
        L01_LinkedList.insertAtEnd(head, 20);
        L01_LinkedList.insertAtEnd(head, 15);
        L01_LinkedList.insertAtEnd(head, 25);
        L01_LinkedList.print(reverse(head));
        // L01_LinkedList.print(reverse(head,null));
    }

    // Iterative Solution
    public static Node reverse(Node head) {
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    //Recursive Solution Method -2 based on iterative
    // private static Node reverse(Node curr, Node prev){
    //     if(curr==null) return prev;
    //     Node next=curr.next;
    //     curr.next=prev;
    //     return reverse(next, curr);
    // }

    //Recursive Solution Method -1
    // private static Node reverse(Node head){
    //     if(head==null || head.next==null)
    //         return head;
    //     Node rest_head= reverse(head.next);
    //     Node rest_tail=head.next;
    //     rest_tail.next=head;
    //     head.next=null;
    //     return rest_head;
    // }

}
