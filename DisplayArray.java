import java.util.*;
public class DisplayArray {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;arr[i++]=dk.nextInt());
        DisplayArrayele(arr,0);
    }
    public static void DisplayArrayele(int[]arrs,int i){
        if (i==arrs.length) return;
        System.out.println(arrs[i]);
        DisplayArrayele(arrs,i+1);
    }
}
