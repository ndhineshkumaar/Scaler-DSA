//import java.util.*;

public class TreeSize {
    public static class Node{

        int data;
        Node left,right;

        public Node(int item){

            data=item;
            left=right=null;
        }
    }

    public static void main(String args[]){

        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);

        //TreeSize tree=new TreeSize();
        
        System.out.println(SizeTree(root));

    }

    public static int SizeTree(Node root){

        if(root==null) return 0;

        int lcount=SizeTree(root.left);
        int rcount=SizeTree(root.right);

        return lcount+rcount+1;
    }
}
