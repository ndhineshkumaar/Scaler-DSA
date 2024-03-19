import java.util.*;

public class CommomEle {
    public static void main(String args[]){
        int[] arr={5,6,8,4,2,5,9};
        int[] arr2={1,3,5,4,5,7,8};

        System.out.print(elecommon(arr,arr2));


    }

    public static ArrayList<Integer> elecommon(int[] arr, int[] arr2){

        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<arr.length;i++){

            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
        }

        for (int i=0;i<arr.length;i++){

            if(map.containsKey(arr2[i])){
                res.add(arr2[i]);
            }
        }

        return res;

    }
}
