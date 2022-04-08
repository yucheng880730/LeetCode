package Minimum_Operations_To_Convert_Number;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumOperationsToConvertNumber {
    public int minimumOperations(int[] nums, int start, int goal){

        // BFS concept
        boolean vis[] = new boolean[1005];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int ans = 0;

        while(!q.isEmpty()){
            int size = q.size();
            // size > 0 & size--
            while(size --> 0){
                int p = q.poll();
                if(p == goal) {
                    System.out.println(ans);
                    return ans;
                }
                else if(p >= 0 && p <= 1000 && !vis[p]){
                    vis[p] = true;
                    for(int x: nums){
                        q.add(p + x);
                        q.add(p - x);
                        q.add(p ^ x);
                    }
                }
            }
            ans++;
        }
        return -1;
    }
}
