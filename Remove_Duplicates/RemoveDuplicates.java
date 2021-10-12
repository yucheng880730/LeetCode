package Remove_Duplicates;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        if(nums.length <= 1) return nums.length;
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i + 1);
        return i + 1;
    }
}
