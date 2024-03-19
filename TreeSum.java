public class TreeSum {
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

        System.out.println(sumtree(root));
    }

    public static int sumtree(Node root){

        if (root == null) {
            return 0;
        }

        int lsum=sumtree(root.left);
        int rsum=sumtree(root.right);

        return lsum+rsum+root.data;
    }
}
