package Sorting;

public class SelectionSortRecursive {
    private static int minIndex(int a[], int i, int j){
        if (i==j){
            return i;
        }
        int k = minIndex(a, i+1, j);

        return (a[i] < a[k]) ? i : k;
    }

    private static void selectionSortRecursive(int a[], int n, int index){
        if (index == n)
            return;
        int k = minIndex(a, index, n-1);

        if (k!= index){
            int temp = a[k];
            a[k] = a[index];
            a[index] = temp;
        }

        selectionSortRecursive(a, n, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,2,1};
        selectionSortRecursive(arr,arr.length,0);
        for(int i : arr)
            System.out.println(i);
    }
}
