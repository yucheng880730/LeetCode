package Test20220415;

import java.util.ArrayList;
import java.util.Collections;

public class Ques2 {
    public int solution(String S) {
        ArrayList<Integer> pothole_list = new ArrayList<Integer>();
        int count = 0;

        for(int i = 0; i < S.length(); ++i)
        {
            if((count != 0 ) && (S.charAt(i) == '.'))
            {
                pothole_list.add(count);
                count = 0;
            }
            else if(S.charAt(i) == 'x')
            {
                count++;
            }
        }

        if (count != 0)
        {
            pothole_list.add(count);
        }

        int ans = 0;
        int budget = S.length();

        Collections.sort(pothole_list, Collections.reverseOrder());

        for(int num : pothole_list)
        {
            if((num + 1) < budget)
            {
                budget = budget - num - 1;
                ans += num;
            }
            else
            {
                ans = ans + budget - 1;
                break;
            }
        }

        return ans;
    }
}
