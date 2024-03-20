import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        //문자열 바꾸기
        for(int i = 0; i < s.length(); i++){
            boolean result = isCorrected(s);
            if(result == true){
                answer++;
            }
            String newstring = move(s);
            s = newstring;
        }
        return answer;
    }
    public boolean isCorrected(String s){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') { 
                st.push(s.charAt(i)); 
            } else {
                if (!st.isEmpty()) {
                    char c = st.pop();
                    char a = s.charAt(i);
                    if(c == '(' && a == ')') { 
                        continue; 
                    }else if(c == '{' && a == '}') { 
                        continue; 
                    }else if(c == '[' && a == ']') { 
                        continue; 
                    }else { 
                        return false; 
                    }
                } else {
                    return false;}
                
            }
        }
        if(st.isEmpty()) { 
            return true; 
        } else { 
            return false; 
        }

    }
    public String move(String s){
        char[] chars = s.toCharArray();
        char firstChar = chars[0]; // 저장 후 이동시킬 문자열의 첫 번째 문자

        // 문자열을 왼쪽으로 이동
        for (int i = 0; i < chars.length - 1; i++) {
            chars[i] = chars[i + 1];
        }

        // 마지막 문자는 처음 문자로 대체
        chars[chars.length - 1] = firstChar;

        return new String(chars);
    }
    
}