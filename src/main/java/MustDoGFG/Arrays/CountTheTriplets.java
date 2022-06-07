package MustDoGFG.Arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
Count the triplets
Easy Accuracy: 42.82% Submissions: 69349 Points: 2
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Example 1:

Input:
N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets:
1 + 2 = 3 and 3 +2 = 5
â€‹Example 2:

Input:
N = 3
arr[] = {2, 3, 4}
Output: 0
Explanation: No such triplet exits
Your Task:
You don't need to read input or print anything. Your task is to complete the function countTriplet() which takes the array arr[] and N as inputs and returns the triplet count

Expected Time Complexity: O(N2)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 103
1 ≤ arr[i] ≤ 105
 */
public class CountTheTriplets {
    private static int countTriplet(int arr[], int n) {
        // code here
        int count = 0;
        HashSet set = new HashSet<>();
        for (int i:arr){
            set.add(i);
        }
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                    //Arrays.stream(arr).anyMatch(a->a==(arr[i]+arr[j]))  -----> Takes More time
                    if(set.contains(arr[i]+arr[j])){
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2};
        System.out.println(countTriplet(arr,arr.length));
    }
}
