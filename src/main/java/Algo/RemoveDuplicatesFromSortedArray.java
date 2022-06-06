package Algo;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int prob[] =new int[]{1,1,2};
        System.out.println(removeDuplicates(prob));
    }
    public static int removeDuplicates(int[] nums) {

        int count =0;
        int replace = 0;
        int n = nums.length;
        for (int i=0;i<n;i++){
            if (i==0){
                count++;
            }
            if (nums[replace]!=nums[i]){
                replace++;
                int temp = nums[replace];
                nums[replace]=nums[i];
                nums[i]=temp;
                count++;
            }
        }
        return count;

//        HashSet<Integer> resultSet = new HashSet<>();
//        for (int i : nums){
//            if(!resultSet.contains(i)){
//                resultSet.add(i);
//            }
//        }
//        System.out.println(resultSet.toString());
    }
}
