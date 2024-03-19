import java.util.*;

public class dptopdownpathsum {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int[][] arr={{1,3,1},
                    {1,5,1},
                    {4,2,1}};
        int i=0;
        int j=0;
        int[][] dp=new int[arr.length][arr[0].length];

        System.out.println(pathsum(arr,i,j,dp));
    }

    public static int pathsum(int[][] arr,int i,int j,int[][] dp){

        if(i>=arr.length || j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if (i==arr.length-1 && j==arr[0].length-1){
            return arr[i][j];
        }

        if(dp[i][j]!=0){

            return dp[i][j];
        }

        int rightpath=pathsum(arr,i,j+1,dp);
        int leftpath=pathsum(arr,i+1,j,dp);

        dp[i][j]=arr[i][j]+Math.min(rightpath,leftpath);

        return arr[i][j]+Math.min(rightpath,leftpath);

    }
}
