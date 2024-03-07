import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        
        char[] c = s.toCharArray();
        
        for(int i = 0; i < c.length; i++) {
            if(c[i] == '('){
                st.push(c[i]);
            } else {
                if(st.isEmpty()){
                    answer = false;
                    break;
                }
                st.pop();
            }
        }
        if(!st.isEmpty()) {
            answer = false;
        } 
        
        return answer;
    }
}