package Length_Of_Last_Word;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        if(null != s && s.length()>0) {
            String[] temp = s.split(" ");
            if(null != temp && temp.length>0) {

                String last = temp[temp.length-1];
                System.out.println(last.length());
                return last.length();

            }
        }
        return 0;
    }
}
