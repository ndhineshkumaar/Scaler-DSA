public class TreeMax {
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

        System.out.println(treeMax(root));
    }

    public static int treeMax(Node root){

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int Max=root.data;

        int leftMax=treeMax(root.left);
        int rightMax=treeMax(root.right);

        if (leftMax>Max) Max=leftMax;
        if (rightMax>Max) Max=rightMax;



        return Max;
    }
}
