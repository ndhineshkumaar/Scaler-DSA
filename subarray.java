import java.util.Scanner;

public class subarray {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=dk.nextInt();
        }
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                for (int k=i;k<=j;k++){
                System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
}
