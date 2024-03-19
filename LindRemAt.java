import java.util.Scanner;

public class LindRemAt {
    public static class Node{
        int data;
        Node next;

        public Node(int data){

            this.data=data;
            this.next=null;
        }
    }

    public static void main(String args[]){

        Scanner dk=new Scanner(System.in);
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        Node head=n1;

        head=RemAt(head,dk.nextInt());

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static Node RemAt(Node head,int i){

        if (head==null ) return null;

        if (i==0){
            return RemoveFirst(head);
        }

        Node temp=head;

        for (int j=1;j<i;j++){
            temp=temp.next;
        }

        Node temp1=temp.next.next;

        temp.next=temp1;

        return head;


    }
    public static Node RemoveFirst(Node head){

        head=head.next;

        return head;
    }
}
