package Longest_Common_Prefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        int prefix_length = 0;
        int number = strs.length;
        String copy = strs[0];
        boolean initEmpty = false;

        if(strs.length == 0) return "";

        for(int q = 0; q < number; q++){
            if(strs[q].length() == 0){
                initEmpty = true;
            }
        }

        if(initEmpty) return "";

        int z = 0;
        boolean flag = true;
        boolean empty = false;

        while(z < strs[0].length()) {

            char value = strs[0].charAt(0);

            for(int i = 0; i < number; i++  ) {

                if (strs[i].charAt(0) != value) {
                    flag = false;
                    break;

                }

            }

            if(!flag){
                break;
            }else  {
                prefix_length++;
            }

            for(int j = 0; j < number; j++){
                strs[j] = strs[j].substring(1);
            }

            for (int r = 0; r < number; r++){
                if(strs[r].length() == 0){
                    empty = true;
                }
            }

            if(empty) break;
        }

        String result = copy.substring(0, prefix_length);
        System.out.println(result);
        return result;
    }
}
