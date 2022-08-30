package Sorting;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i=0; i<arr.length;i++){
            int index=i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[index]){
                    index=j;
                }
            }
            int smallerNumber= arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNumber;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,2,1};
        selectionSort(arr);
        for(int i : arr)
            System.out.println(i);
    }


}
