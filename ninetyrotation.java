import java.util.Scanner;

public class ninetyrotation {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        int[][] arr=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=dk.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp=arr[i][n-j-1];
                arr[i][n-j-1]=arr[i][j];
                arr[i][j]=temp;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
