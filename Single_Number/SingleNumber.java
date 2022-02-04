package Single_Number;

import java.util.HashMap;

public class SingleNumber {

    // using hashmap
    // key - number in the given array
    // value - count of that element
    public int finction1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        for(int num : nums){
            if(map.get(num) == 1){
                return num;
            }
        }
        return -1;
    }

    // using XOR
    public int function2(int[] nums) {
        int ans = 0;
        for(int e: nums) ans = ans ^ e;
        System.out.println(ans);
        return ans;
    }
}
