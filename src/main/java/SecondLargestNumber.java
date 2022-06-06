public class SecondLargestNumber {

    public static int getSecondLargest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++){
            for(int j = i+1; j < total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a[total-2];
    }

//    public static void printTwoLargest(int[] arr, int arr_size){
//        int i, first, second;
//
//        if (arr_size < 2){
//            System.out.println("Invalid");
//        }
//
//        int largest = second = Integer.MIN_VALUE;
//        for(i =0; i<arr_size; i++){
//            largest = Math.max(largest,arr[i]);
//        }
//        for(i=0; i<arr_size; i++){
//            if(arr[i] != largest){
//                second = Math.max(second,arr[i]);
//            }
//        }
//        if(second == Integer.MIN_VALUE){
//            System.out.println("No Second Largest element");
//        }
//        else System.out.printf("Second Largest %d", second);
//    }

    public static void printTwoLargest(int[] arr, int arr_size) {
        int i, first, second;

        if (arr_size < 2) {
            System.out.println("Invalid");
        }

        first = second = Integer.MIN_VALUE;

        for(i=0; i<arr_size;i++){
            if(arr[i]> first){
                second=first;
                first = arr[i];
            }
            else if(arr[i]> second && arr[i] != first){
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("No Second Largest element");
        }
        else System.out.printf("Second Largest %d", second);
    }
    public static void main(String[] args) {
        int arr[] = {5,1,2,4,3,2,1};
        int size = arr.length;
        printTwoLargest(arr,size);
    }
}
