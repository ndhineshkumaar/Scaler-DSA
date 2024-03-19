import java.util.*;

public class QueueKelerever {
    public static void main(String args[]){

        Scanner dk=new Scanner(System.in);
        Queue<Integer>  que= new LinkedList<>();

        que.offer(20);
        que.offer(50);
        que.offer(80);
        que.offer(10);
        que.offer(60);
        que.offer(70);
        que.offer(30);
        que.offer(65);


        reverse(que,dk.nextInt());

    }
    
    public static void reverse(Queue<Integer> que,int k){

        Stack<Integer> st = new Stack<>();

        for (int i=0;i<k;i++){
            st.push(que.remove());
        }

        for (int i=0;i<k;i++){
            que.offer(st.pop());
        }

        for (int i=0;i<que.size()-k;i++){
            que.offer(que.remove());
        }

        System.out.println(que);
        
    }
}
