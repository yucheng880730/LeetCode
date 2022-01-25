package PascalsTriangleTwo;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleTwo {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> res = new ArrayList<>();

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i <= rowIndex; i++){
            res.add(new ArrayList<Integer>());
        }

        for(int i = 0; i <= rowIndex; i++){
            for(int j = 0; j < i + 1; j ++){
                if(j == 0 || j == i)
                    res.get(i).add(1);
                else{
                    int temp = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    res.get(i).add(temp);
                }
            }
        }

        System.out.println(res);
        // System.out.println(res.size());

        for(int x = 0; x < rowIndex; x++) {
            res.remove(0);
        }

        ans = res.get(0);
        System.out.println(ans);

        return ans;
    }
}
