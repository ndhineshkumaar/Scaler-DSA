import java.util.Scanner;

public class LindSearchK {
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

        System.out.print(kele(head,dk.nextInt()));
    }

    public static boolean kele(Node head,int K){

        Node temp=head;

        while (temp!=null){
            if (temp.data==K){
                return true;
            }
            temp=temp.next;
        }

        return false;
    }
}
