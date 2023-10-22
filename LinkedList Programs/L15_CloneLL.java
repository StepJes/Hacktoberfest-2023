public class L15_CloneLL {
    Node Clone(Node h1){
        Node curr=h1;
        while(curr!=null){
            Node next=curr.next;
            curr.next=new Node(curr.data);
            curr.next.next=next;
            curr=next;
        }
        for(curr=h1;curr!=null;curr=curr.next.next){
            curr.next.random=(curr.random==null)? null: curr.random.next;
        }
        Node h2=h1.next;
        Node clone =h2;
        for(curr=h2;curr!=null;curr=curr.next){
            curr.next=curr.next.next;
            clone.next= (clone.next!=null)? clone.next.next: null;
            clone=clone.next;
        }
        return h2;
    }
}
