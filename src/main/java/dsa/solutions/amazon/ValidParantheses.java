package dsa.solutions.amazon;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValidParenthesis(String expression) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<expression.length();i++){
            char ch = expression.charAt(i);
            if(ch=='[' || ch=='{' || ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty())
                    return false;

                if(ch==']' && st.peek()=='[')
                    st.pop();
                else if(ch=='}' && st.peek()=='{')
                    st.pop();
                else if(ch==')' && st.peek()=='(')
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }

}
