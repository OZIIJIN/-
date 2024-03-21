import java.util.*;
class Solution {
    public int solution(String word) {
        int answer = 0;
        int length = word.length();
        int[] nums = {781, 156, 31, 6, 1};
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        map.put("E", 1);
        map.put("I", 2);
        map.put("O", 3);
        map.put("U", 4);
        
        String[] words = word.split("");
        for(int i = 0; i < words.length; i++) {
            answer += 1 + map.get(words[i])*nums[i];
        }
        
        return answer;
    }
}