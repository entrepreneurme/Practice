public class RotateArray {
    // Rotate
    //4, 7 ,10 ,1, 3
    // search 7 return index

    static int RotateAndSearch(int arr[], int n,int key){
        int pivot = checkPivot(arr, 0, n - 1);
        if(pivot == -1){
            return binarySearch(arr , 0, n-1, key);
        }
        if(arr[pivot]==key){
            return pivot;
        }
        if (arr[0]<=key)
            return binarySearch(arr,0,pivot-1,key);
        return binarySearch(arr,pivot+1, n-1,key);
    }

    private static int checkPivot(int[] arr, int low, int high) {
        if (high < low)
            return -1;
        if(high==low)
            return low;
        int mid = (low+high)/2;
        if (mid<high && arr[mid] > arr[mid+1])
            return mid;
        if (mid > low && arr[mid] < arr[mid-1])
            return (mid-1);
        if (arr[low]>=arr[mid])
            return checkPivot(arr,low,mid-1);
        return checkPivot(arr,mid+1,high);
    }

    static int binarySearch(int arr[], int low, int high, int key){
        if(high < low)
            return -1;
        int mid = (low + high)/2;
        if(key == arr[mid]){
            return mid;
        }
        if(key > arr[mid])
            return binarySearch(arr,(mid+1),high,key);
        return binarySearch(arr,low,(mid-1),key);
    }

    public static void main(String[] args) {
        int array[] = {4, 7 ,10 ,1, 3};
        int n = array.length;
        int key = 5;
        System.out.println("index is : " + RotateAndSearch(array,n,key));
    }
}
