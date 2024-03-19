public class insertionsort {
    public static void main (String args[]){
        int[] arr={3,5,2,2,3,3,3,31,4,20};
        for (int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i:arr) System.out.print(i+" ");
    }
}