package Sorting;

public class BubbleSortRecursive {
    private static void bubbleSort(int[] arr, int length) {
        if(length==1)
            return;
        int count =0;

        for (int i=0; i<length-1;i++)
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count +=1;
            }
        if (count==0)
            return;

        bubbleSort(arr,length-1);




    }
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        bubbleSort(arr, arr.length);
    }
}
