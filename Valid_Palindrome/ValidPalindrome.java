package Valid_Palindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            while(i <= s.length() - 1 && !isAlphaNumeric(s.charAt(i))) {
                i++;
            }
            while (j >= 0 && !isAlphaNumeric(s.charAt(j))) {
                j--;
            }
            if(i > j) break;
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(Character.toUpperCase(a) != Character.toUpperCase(b)) {
                System.out.println(false);
                return false;
            }
            i++;
            j--;
        }
        System.out.println(true);
        return true;
    }

    public boolean isAlphaNumeric(char char1) {
        return (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z') || (char1 >= '0' && char1 <= '9');
    }
}
