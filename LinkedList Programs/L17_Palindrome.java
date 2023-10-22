public class L17_Palindrome {
    public static void main(String[] args) {
        Node head = new Node(10);
        L01_LinkedList.insertAtEnd(head, 15);
        L01_LinkedList.insertAtEnd(head, 11);
        L01_LinkedList.insertAtEnd(head, 16);
        L01_LinkedList.insertAtEnd(head, 10);
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(Node head) {
        if(head==null) return true;
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node rev= L07_ReverseLL.reverse(slow.next);
        Node curr=head;
        while(rev!=null){
            if(rev.data!=curr.data){
                return false;
            }
            rev=rev.next;
            curr=curr.next;
        }
        return true;
    }
}
