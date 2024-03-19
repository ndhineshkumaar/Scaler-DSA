import java.util.*;

public class FirstRepeatingChar {
    public static void main(String args[]){

        String s="dhinesh kumaar";
        firstrepeat(s);
    }

    public static void firstrepeat(String s){

        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<s.length();i++){

            if(set.contains(s.charAt(i))){

                System.out.println(s.charAt(i));
                return;
            }
            else{

                set.add(s.charAt(i));
            }
        }

        System.out.println(-1);

    }
}
