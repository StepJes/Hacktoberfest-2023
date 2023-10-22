public class L09_ReverseLLofSizeK {
    public static void main(String[] args) {
        Node head = new Node(10);
        L01_LinkedList.insertAtEnd(head, 5);
        L01_LinkedList.insertAtEnd(head, 20);
        L01_LinkedList.insertAtEnd(head, 15);
        L01_LinkedList.insertAtEnd(head, 25);
        L01_LinkedList.print(reverse(head,3));
    }

    // Recursive Solution
    // private static Node reverse(Node head,int k) {
    //     Node curr=head;
    //     Node next=null;
    //     Node prev=null;
    //     int count=0;
    //     while(curr!=null&& count<k){
    //         next=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //         count++;
    //     }
    //     if(next!=null){
    //         Node rest_head=reverse(next, k);
    //         head.next=rest_head;
    //     }
    //     return prev;
    // }

    //Iterative Solution
    static Node reverse(Node head, int k){
        Node curr=head;
        Node prevFirst=null;
        boolean isFirstPass=true;
        while(curr!=null){
            Node first = curr, prev=null;
            int count=0;
            while(curr!= null&& count <k){
                Node next= curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                count++;
            }
            if(isFirstPass){
                head=prev;
                isFirstPass = false;
            }
            else{
                prevFirst.next=prev;
            }
            prevFirst=first;
        }
        return head;
    }
}
