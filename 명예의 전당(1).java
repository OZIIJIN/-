import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int length = score.length;
        int[] answer = new int[length];
        
        List<Integer> scores = new ArrayList<>();
        List<Integer> minscore = new ArrayList<>();
        
        for(int i = 0; i < length; i++){
            scores.add(score[i]);
            if(scores.size() <= k){
                int min = Collections.min(scores);
                minscore.add(min);
            } else {
                Collections.sort(scores);
                List<Integer> sublist = scores.subList(scores.size()-k,scores.size());
                int min = sublist.get(0);
                minscore.add(min);
            }
            
        }
        for(int i = 0; i < answer.length; i++){
            answer[i] = minscore.get(i);
        }
        return answer;
    }
}
