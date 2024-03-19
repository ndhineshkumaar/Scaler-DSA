public class Selectionsort {
    public static void main (String args[]){
        int[] arr={3,5,2,2,3,3,3,31,4,20};
        for (int i=0;i<arr.length;i++){
            int minValue=arr[i];
            int minIndex=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<minValue){
                    minValue=arr[j];
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=minValue;
            arr[minIndex]=temp;
        }
        for (int i:arr) System.out.print(i+" ");
    }
}
