package Palindrome_Number;

import java.util.Stack;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        // 1. check if x is positive
        // 2. make an array push x % 10 and x= x / 10

        Stack<Integer> s = new Stack<Integer>();
        int y = x;

        if (x < 0) {
            return false;
        }

        int value;

        while (x > 0) {
            value = x % 10;
            s.push(value);
            x = x / 10;
        }

        while(s.size() != 0){
            if(y % 10 != s.pop()){
                return false;
            }else {
                y /= 10;
            }
        }

        if(y != 0) return false;

        return true;
    }
}

/**    wrong solution
 *
 *     int res = 0;
 *     int items = s.size();
 *
 *         for(int i = 0; i < items; i++)
 *         {
 *         res += s.pop() * Math.pow(10, i);
 *         }
 *
 *         if(y == res){
 *
 *         return true;
 *
 *         }else{
 *
 *         return false;
 *
 *         }
 * */

/**        other solution
 *
 *         while(y > 0){
 *
 *            if(s.isEmpty()) return false;
 *            if(y % 10 != s.pop()) return false;
 *            y / =10;
 *
 *         }
 *         return true;
 * */
