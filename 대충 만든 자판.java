import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answers = new int[targets.length];
            
        for(int i = 0; i < keymap.length; i++){
            String first = keymap[i];
            for(int j = 0; j < first.length(); j++){
                char c = first.charAt(j);
                if(map.containsKey(c)){
                    int inx = map.get(c);
                    map.put(c, Math.min(inx, j+1));
                }else{
                    map.put(c, j+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            int answer = 0;
            boolean noanswer = false;
            String target = targets[i];
            for(char c: target.toCharArray()){
                if(map.containsKey(c)){
                        answer += map.get(c);
                }else{
                    noanswer = true;
                    break;
                }
            }
            answers[i] = noanswer ? -1 : answer;
        }
        return answers;
    }
}
