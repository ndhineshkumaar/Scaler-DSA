import java.util.*;
public class removeprime {
    public static void main(String args[]){
        Scanner dk= new Scanner(System.in);
        int n=dk.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        for (int i=0;i<n;i++){
            A.add(dk.nextInt());
        }
        for (int i=A.size()-1;i>=0;i--){
            int count=0;
            for (int j=1;j<=A.get(i);j++){
                if (A.get(i)%j==0){
                    count++;
                }
            }
            if (count>2 || A.get(i)==2) A.remove(i);
        }
        for (int i:A) System.out.print(i+" ");
    }
}
