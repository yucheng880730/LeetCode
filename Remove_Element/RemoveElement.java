package Remove_Element;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        if(null == nums || nums.length == 0) return 0;

        int count = 0;
        for(int i = 0 ; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[count]=nums[i];
                count++;
            }
        }

        System.out.println(count);
        return count;




//我的寫法有bug
//        int count = 0;
//
//        for(int z = 0; z < nums.length; z++){
//            if(nums[z] == val){
//                count++;
//            }
//        }
//
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == val){
//                for(int j = i; j < nums.length - 1; j++){
//                    nums[j] = nums[j+1];
//                }
//            }
//        }
//
//
//        System.out.println(nums.length - count);
//        return nums.length - count;
    }
}
