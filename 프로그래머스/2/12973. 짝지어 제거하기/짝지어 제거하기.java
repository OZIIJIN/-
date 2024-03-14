import java.util.*;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        int answer = 0;
        boolean check = true;
        
        for(int i = 0; i < s.length(); i++) {
            if(!st.isEmpty() && st.peek()==s.charAt(i)) {
                st.pop();
            } else {
                st.push(s.charAt (i));
            }
        }
        if(st.isEmpty()) {
            answer = 1;
        } 
    
        return answer;
    }
}