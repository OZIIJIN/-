import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        
        for(char c : arr) {
            if(c == '('){
                st.push(c);
            }else if(c == ')' && st.size() > 0){
                st.pop();
            }else if(c == ')' && st.size() == 0){
                answer = false;
                return answer;
            }
        }
        
        answer = st.empty();
        
        return answer;
    }
}