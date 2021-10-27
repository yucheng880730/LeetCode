package Implement_strStr;

public class ImplementStrStr {
    public int strStr(String haystack, String needle){

        // method1 use library indexOf()
        /***
        int index = haystack.indexOf(needle);
        System.out.println(index);
        return index;
         ***/

        // method2
        int haystacklength = haystack.length();
        int needlelength = needle.length();
        int i = 0;

        if(needlelength > haystacklength) return -1;

        if(needlelength == 0) return 0;

        while(i <= haystacklength - needlelength) {
            if(haystack.substring(i, i + needlelength).equals(needle)) return i;
            i++;
        }

        return -1;


        /***
        if(needle.isEmpty()) return 0;

        int flag = 0;
        boolean move = false;

        while(!haystack.isEmpty()){
            if(haystack.charAt(0) == needle.charAt(0)){
                for(int i = 0; i < needle.length(); i++){
                    if(haystack.charAt(i) != haystack.charAt(i)) break;
                    move = true;

                }
            }else {
                haystack = haystack.substring(1);
                flag++;
            }
        }

        if(move){
            return -1;
        }else{
            return flag;
        }

         ***/
    }
}
