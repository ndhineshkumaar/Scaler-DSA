import java.util.Scanner;

public class LindPrintMid {
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
        //Node n6 = new Node(60);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        //n5.next = n6;

        Node head=n1;

        System.out.print(printmid(head));
    }

    public static int printmid(Node head){

        int count=0;
        Node temp=head;

        while (temp!=null){
            count++;
            temp=temp.next;
        }

        if (count%2==0){
            return evenmid(head);
        } else{
            return oddmid(head);
        }
    }

    public static int evenmid(Node head){

        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;
    }

    public static int oddmid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;
    }
}
