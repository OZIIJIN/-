import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int count = 1; 
        Map<String, Integer> map = new HashMap<>();
        map.put(words[0], 0);
        
        for(int i = 1; i < words.length; i++) {
            if(map.containsKey(words[i]) || words[i].charAt(0) != words[i-1].charAt(words[i-1].length()-1)) {
                int indx = i % n + 1 ; 
                answer[0] = indx;
                answer[1] = count/n + 1;
                break;
            } else {
                map.put(words[i], i % n);
                count++;
            }
        }
        if(count == words.length) {
            answer[0] = 0;
            answer[1] = 0;
        }
        

        return answer;
    }
}