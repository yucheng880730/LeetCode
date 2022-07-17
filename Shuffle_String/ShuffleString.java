package Shuffle_String;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {

        char[] arr = new char[s.length()];

        for(int i = 0; i < arr.length; i++){
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);

//        int index = 0;
//        String ans = "";
//
//        for(int i = 0; i < indices.length; i++){
//            if(indices[i] == index){
//                ans = ans + s.charAt(i);
//                index++;
//                i = -1;
//            }
//        }
//        System.out.println(ans);
//        return ans;

    }
}
