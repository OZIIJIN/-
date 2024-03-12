import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<Character> alphabet = new ArrayList<>();
        
        //초기 알파벳 리스트 세팅
        for(char c = 'a'; c <= 'z'; c++){
            alphabet.add(c);
        }
        
        //skip 알파벳 삭제
        for(char c : skip.toCharArray()){
            int inx = alphabet.indexOf(c);
            alphabet.remove(inx);
        }
        int length = alphabet.size();
        
        //문자열 만들기
        for(char c : s.toCharArray()){
            int inx = alphabet.indexOf(c);
            inx += index;
            answer += String.valueOf(alphabet.get(inx%length));
        }
        return answer;
    }
}