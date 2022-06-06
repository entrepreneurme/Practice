package Algo;

import java.sql.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static int solution(String[] E) {
        // write your code in Java s SE 8
        int maxcount = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int days = E.length;
        for (int i = 0; i < E.length; i++){
            char[] arr = E[i].toCharArray();
            for (int j = 0; j < arr.length; j++) {
                int p = arr[j] - '0';
                if (!map.containsKey(p)) {
                    Set<Integer> set = new HashSet<>();
                    set.add(i);
                    map.put(p, set);
                    if (maxcount < 1) {
                        maxcount = 1;
                    }
                } else {
                    Set<Integer> set = map.get(p);
                    set.add(i);
                }
            }
        }

        for (int i = 0; i< map.size() - 1; i++){
            for (int j = i+1; j < map.size(); j++){
                Set<Integer> result = new HashSet<>();
                if(map.get(i) != null){
                    result.addAll(map.get(i));
                }
                if(map.get(j) != null){
                    result.addAll(map.get(j));
                maxcount = Math.max(maxcount, result.size());
            }
        }
    }
        return maxcount;
}
/*private static int solution(int[] A) {
    int b = 0;
    int h = 0;
    for(int i = 0; i < A.length; i++)
    {
        if(A[i] > h)
            b = b + (A[i] - h);
        h = A[i];
    }
    if(b > 1000000000 || b<0){
        return -1;
    }
    return b;
}*/

    public static void main(String[] args) {
        String[] abc = {"801234567", "180234567", "0", "189234567", "891234567", "98", "9"};
//        for (int i=0;i<1000000661;i++){
//            abc[i] = i;
//        }
        System.out.println(solution(abc));
    }
}
