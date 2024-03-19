import java.util.*;

public class HeapbiigestK {

    public static void main(String args[]){

        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;arr[i++]=dk.nextInt());
        int K=dk.nextInt();

        biggestKele(arr,K);
    }

    public static void biggestKele(int[] arr,int k){

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        int i=0;

        while(i<k){
            pq.add(arr[i]);
            i++;
        }

        while(i<arr.length){
            if(arr[i]>pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }
            i++;
        }

        while(pq.size()>0){

            System.out.print(pq.remove());
            System.out.print(" ");
        }
    }
}
