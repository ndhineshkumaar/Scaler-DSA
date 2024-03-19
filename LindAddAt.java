import java.util.Scanner;

public class LindAddAt {
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
        head=AddAt(head,dk.nextInt(),dk.nextInt());

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static Node AddAt(Node head,int Val,int i){
        if (head==null || i==0) {
            return addfirst(head,Val);
        }
        Node n=new Node(Val);
        Node temp=head;
        for (int j=1;j<i;j++){
            temp=temp.next;
        }
        Node temp1=temp.next;
        temp.next=n;
        n.next=temp1;
        return head;
    }

    public static Node addfirst(Node head,int N){
        Node n=new Node(N);
        n.next=head;
        head=n;
        return head;
    }
}
