package Search_Insert_Position;

import java.util.Arrays;

public class SearchInsertPositoin {
    public int searchInsert(int[] nums, int target) {

        if(nums == null || nums.length == 0) return 0;

        int i = 0;
        int j = nums.length - 1;
        int index = - 1;

        while(i <= j){
            index = (i + j) / 2;
            if(nums[index] == target){
                System.out.println(index);
                return index;
            }else if(nums[index] > target){
                j = index - 1;
            }else{
                i = index + 1;
            }
        }
        System.out.println(i);
        return i;
    }
}
