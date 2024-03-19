import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uppertolower{
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        String s=dk.nextLine();
        StringBuilder S=new StringBuilder(s);
        for (int i=0;i<S.length();i++){
            if (S.charAt(i)>='A' && S.charAt(i)<='Z'){
                S.setCharAt(i,(char)(S.charAt(i)+32));
            }
        }
        System.out.println(S);
    }
}
