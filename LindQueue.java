import java.util.*;

public class LindQueue {
    public static void main(String args[]){

        LinkedList<Integer> Queue =new LinkedList<>();

        Queue.addLast(50);
        Queue.addLast(90);
        Queue.addLast(90);
        Queue.addLast(0);
        Queue.addLast(230);
        Queue.addLast(450);
        Queue.addLast(60);


        System.out.println(Queue.removeFirst());
        System.out.println(Queue.removeFirst());
        System.out.println(Queue.removeFirst());
    }
}
