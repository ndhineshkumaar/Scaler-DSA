import java.util.*;

public class dptopdownstaircase {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);

        int N=dk.nextInt();
        int[] arr=new int[N+1];

        System.out.println(Stair(N,arr));
    }

    public static int Stair(int N,int[] dp){

        if(N==1 || N==2) return N;

        if(N==3) return 4;

        if (dp[N]!=0) return dp[N];

        int nm1=Stair(N-1,dp);
        int nm2=Stair(N-2,dp);
        int nm3=Stair(N-3,dp);

        dp[N]=nm1+nm2+nm3;

        return nm1+nm2+nm3;

    }
}
