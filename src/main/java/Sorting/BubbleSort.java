package Sorting;

public class BubbleSort {
    private static void bubblesort(int[] arr) {
        int len = arr.length;
        int temp = 0;

        for (int i=0;i<len;i++){
            for(int j=1;j<(len-1);j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,6,1,2,9,5};
        bubblesort(arr);
        for(int i : arr)
            System.out.println(i);
    }


}
