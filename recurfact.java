import java.util.*;
public class recurfact {
    public static int factrecur(int N){
        if(N==0 || N==1){
            return 1;
        }
        return N*factrecur(N-1);
    }
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        System.out.println(factrecur(n));
    }
}
