package Check_If_Sentence_Is_Pangram;

public class CheckIfSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {

        int[] temp=new int[26];

        for(int i = 0; i < sentence.length(); i++){
            temp[sentence.charAt(i)-'a']++;
        }

        for(int i=0;i<temp.length;i++) {
            if(temp[i]==0);
            return false;
        }

        return true;



// My solution
//        int check = 0;
//        char[] vocabulary = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//
//        for(int i = 0; i < sentence.length(); i++){
//            for(int j = 0; j < vocabulary.length; j++){
//                if(sentence.charAt(i) == vocabulary[j]) vocabulary[j] = '@';
//            }
//        }
//
//        for(int i = 0; i < vocabulary.length; i++){
//            if(vocabulary[i] == '@') check++;
//        }
//
//        if(check == 26) return true;
//        return false;
    }
}
