

public class LinkedList {
        int val;
        LinkedList next;
        LinkedList(){}
        LinkedList(int val){
            this.val=val;
        }
        LinkedList(int val,LinkedList next){
            this.val=val;
            this.next=next;
        }
        public static LinkedList head;

    public static LinkedList addEnd(LinkedList head,int val){
        if(head==null){
            LinkedList ele=new LinkedList(val);
            return ele;
        }
        LinkedList dum=head;
        while(dum.next!=null){
            dum=dum.next;
        }
        dum.next=new LinkedList(val);
        return head;
    }

    public static LinkedList reverse(LinkedList head){
        if(head==null){
            return null;
        }
        LinkedList prev=head;
        LinkedList curr=prev.next;
        while(curr!=null){
            LinkedList nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        head.next=null;
        return prev;
    }

    public static void printList(LinkedList head){
        LinkedList dum=head;
        while(dum!=null){
            System.err.print(dum.val+" ");
            dum=dum.next;
        }
    }
    public static void main(String[] args) {
         int a[]={3,4,5,56,20};
         for(int i:a){
           head=addEnd(head,i);
         }
         LinkedList ans=reverse(head);
         printList(ans);
    }
}
