package MustDoGFG.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfPairs {
    static long countPairs(int x[], int y[], int M, int N){
        long count =0;
        int zeros = 0, ones=0 , twos=0, threes=0, fours =0;
        Arrays.sort(x);
        Arrays.sort(y);
        for(int i=0;i<N;i++){
            if(y[i]==0)zeros++;
            if(y[i]==1)ones++;
            if(y[i]==2)twos++;
            if(y[i]==3)threes++;
            if(y[i]==4)fours++;
        }
        for(int i=0;i<M;i++){
            if(x[i]==0){
                continue;
            } else if (x[i]==1) {
                count+=zeros;
            } else if (x[i]==2) {
                int index = getIndex(y,N,2);
                if(index!=-1){
                    count+=N-index;
                }
                count-=threes;
                count-=fours;
                count+=ones+zeros;
            }
            else {
                int index = getIndex(y, N, x[i]);
                if(index!=-1){
                    count+=N-index;
                }
                count+=ones+zeros;
                if (x[i]==3){
                    count+=twos;
                }
            }
        }

        return count;
    }

    private static int getIndex(int[] y, int n, int i) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if (y[mid]>i){
                ans = mid;
                high=mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }



}
