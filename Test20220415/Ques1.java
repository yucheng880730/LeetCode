package Test20220415;

import java.util.ArrayList;

public class Ques1 {
    public int solution(int [] input) {

        int maxPairs = 0;
        if(input.length == 1 || input.length == 0)
            return maxPairs;

        maxPairs += (input[0] & 1) == (input[input.length - 1] & 1)?1:0;
        for(int i = 1; i < input.length - 2;){
            if(maxPairs == 0 && i == 1){
                if((input[i - 1] & 1) == (input[i] & 1))
                    maxPairs += 1;
            }
            if((input[i] & 1) == (input[i + 1] & 1)){
                i += 2;
                maxPairs += 1;
            }else{
                i += 1;
            }
        }

        return maxPairs;
    }
}
