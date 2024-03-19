import java.util.*;
public class FirstIndex {
    public static int indexfirst(int[] arr,int a,int i){
        if (i==arr.length) return -1;
        if (arr[i]==a) return i+1;
        return indexfirst(arr,a,i+1);

    }
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int[] arr={5,6,8,6,21,5};
        int a=dk.nextInt();
        System.err.println(indexfirst(arr,a,0));
    }
}
