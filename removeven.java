import java.util.*;
public class removeven {
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int n=dk.nextInt();
        ArrayList<Integer> lst=new ArrayList<>();
        for (int i=0;i<n;i++){
                lst.add(dk.nextInt());
            }
        for (int i=(n-1);i>=0;i--){
            if (lst.get(i)%2==0) lst.remove(i);
        }
        System.out.println(lst);
    }
}
