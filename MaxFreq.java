import java.util.*;

public class MaxFreq {
    public static void main(String args[]){
        String s="abababaceeeeeeede";
        maxfreq(s);
    }

    public static void maxfreq(String s){

        HashMap<Character,Integer> map=new HashMap<>();

        int i=0;
        while (i<s.length()){
            if (map.containsKey(s.charAt(i))){

                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                i++;
            }
            else{

                map.put(s.charAt(i),1);
                i++;
            }
        }

        int maxValue=0;
        char maxChar='0';

        for (char c:map.keySet()){

            if (map.get(c)>maxValue){

                maxValue=map.get(c);
                maxChar=c;

            }
        }

        System.out.print(maxChar);

    }
}
