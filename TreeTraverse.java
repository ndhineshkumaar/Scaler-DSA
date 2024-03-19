import java.util.*;

public class TreeTraverse {

    public static class Node{

        int data;
        Node right;
        Node left;

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

        TreeTraverse tree = new TreeTraverse();
    
        System.out.println("In-order traversal:");
        tree.inOrderTraversal(root);

        System.out.println("\nPre-order traversal:");
        tree.preOrderTraversal(root);

        System.out.println("\nPost-order traversal:");
        tree.postOrderTraversal(root);
    }

    public static void inOrderTraversal(Node root){

        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    
    }
    public static void preOrderTraversal(Node root){

        if (root != null) {
            System.out.print(root.data + " ");
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
        }
    
    }

    public static void postOrderTraversal(Node root){

        if (root != null) {
            inOrderTraversal(root.left);
            inOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    
    }
}
