import java.util.*;

public class Repeat {
    public static void main(String args[]){
        int[] arr = { 3, 8, 5, 8, 5, 3, 5, 10, 9, 1, 7, 5, 6, 0, 10, 7, 10, 2, 1, 0, 3, 9, 4, 6, 0, 3, 8, 5, 7, 4, 0, 3, 5, 8, 5, 7, 0, 9, 9, 6, 1, 0, 2, 2, 5, 1, 5, 0, 4 };
        int[] arr2 = {10, 10, 6, 1, 5, 2, 10, 0, 8, 0, 6, 10, 3};

        Repeat repeat = new Repeat();
        repeat.findIntersection(arr, arr2);


    }

    public void findIntersection(int[] A, int[] B) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

       for (int num : A) {
           frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
       }

       for (int num : B) {
           if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
               System.out.print(num + " ");
               frequencyMap.put(num, frequencyMap.get(num) - 1);
           }
       }
   }
}
