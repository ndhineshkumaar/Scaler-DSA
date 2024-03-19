import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reversevowels{
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        String s=dk.nextLine();
        s=s.toLowerCase();
        StringBuilder S=new StringBuilder(s);
        int i=0;
        int j=S.length()-1;
        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        while (i<j){
            if (vowels.contains(S.charAt(i)) && vowels.contains(S.charAt(j))){
                char temp = S.charAt(i);
                S.setCharAt(i, S.charAt(j));
                S.setCharAt(j, temp);
                i++;
                j--;
            }
            if (!vowels.contains(S.charAt(i))) i++;
            if (!vowels.contains(S.charAt(j))) j--; 
        }
        System.out.print(S);
    }
}
