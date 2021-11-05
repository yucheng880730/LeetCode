package Maximum_Subarray;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        // int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int cur = nums[0];
        int res = nums[0];

        for(int i = 1; i < nums.length; i++){
            cur = cur + nums[i];
            if(cur < 0 || nums[i] > cur){
                cur = nums[i];
            }
            if(res < cur){
                res = cur;
            }
        }
        System.out.println(res);
        return res;
    }
}
