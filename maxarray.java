import java.util.*;
public class maxarray {
    public static void main (String args[]){
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=dk.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for (int i:arr){
            if (i>max) max=i;
        }
        System.out.println(max);
    }
}
