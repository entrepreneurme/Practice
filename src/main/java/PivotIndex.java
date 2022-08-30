public class PivotIndex {
    private static int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int leftsum = 0;
            int rightsum=0;
            for (int li=0;li<i;li++){
                if(i==0){
                    break;
                }
                leftsum +=nums[li];

            }
            for (int ri = i+1;ri<nums.length;ri++){
                rightsum +=nums[ri];
            }
            if(leftsum==rightsum){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,7,3,6,5,6};
        pivotIndex(nums);
    }
}
