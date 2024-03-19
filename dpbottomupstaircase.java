import java.util.*;

public class dpbottomupstaircase {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);

        int N=dk.nextInt();

        System.out.println(Stair(N));
    }

    public static int Stair(int N){

        int[] dp=new int[N+1];

        dp[1]=1;
        dp[2]=2;
        dp[3]=4;

       for (int i=4;i<dp.length;i++){

        dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
       }

        return dp[dp.length-1];

    }
}
