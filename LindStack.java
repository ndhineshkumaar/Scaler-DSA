import java.util.*;

public class LindStack {
    public static void main(String args[]){

        LinkedList<Integer> stack=new LinkedList<>();

        stack.addFirst(50);
        stack.addFirst(30);
        stack.addFirst(20);
        stack.addFirst(100);
        stack.addFirst(25);

        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());

    }
}
