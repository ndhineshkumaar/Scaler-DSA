import java.util.*;

public class reversearray {
    public static void main (String args[]){
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=dk.nextInt();
        }
        for (int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for (int i:arr) System.out.print(i+" ");
    }
}
