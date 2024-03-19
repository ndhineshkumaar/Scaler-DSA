import java.util.*;

public class dpbottomupfibbinacci {
  public static void main(String args[]){

    Scanner dk=new Scanner(System.in);
    int N=dk.nextInt();
    System.out.println(fibbi(N));
  }  

  public static int fibbi(int N){

    int[] dp=new int[N+1];

    dp[0]=0;
    dp[1]=1;

    for (int i=2;i<dp.length;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }

    return dp[dp.length-1];
  }
}