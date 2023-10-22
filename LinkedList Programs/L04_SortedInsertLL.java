import java.util.Scanner;

public class L04_SortedInsertLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head= null;
        for(int i=0;i<5;i++){
            int x= sc.nextInt();
            head=sortedInsert(head, x);
        }
        System.out.println();
        L01_LinkedList.print(head);
        sc.close();
    }

    public static Node sortedInsert(Node head, int x){
        Node temp = new Node(x);
        if(head==null) return temp;
        if(x<head.data){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        while(curr.next!=null&& curr.next.data<x){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
}
