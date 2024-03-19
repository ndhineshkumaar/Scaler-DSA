import java.util.*;

public class dptopdownfibbinacci {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int N=dk.nextInt();
        int[] arr=new int[N+1];
        System.out.print(fibbi(N,arr));
    }

    public static int fibbi(int N,int[] dp){

        if (N==0 || N==1 ){
            return N;
        }

        if(dp[N]!=0){
            return dp[N];
        }

        int nm1=fibbi(N-1,dp);
        int nm2=fibbi(N-2, dp);

        dp[N]=nm1+nm2;

        return nm1+nm2;

    }
}
