package Valid_Parentheses;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> STACK = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                STACK.push(ch);
            }else{
                if(STACK.isEmpty()){
                    return false;
                }
                if(ch == ')' && STACK.peek() != '(') {
                    return false;
                }
                if(ch == ']' && STACK.peek() != '[') {
                    return false;
                }
                if(ch == '}' && STACK.peek() != '{') {
                    return false;
                }
                STACK.pop();
            }
        }
        return STACK.isEmpty();
    }
}
