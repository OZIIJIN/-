import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            
            List<Integer> temp = new ArrayList<>();
            
            for(int j = a-1; j <= b-1; j++){
                temp.add(array[j]);
            }
            
            Collections.sort(temp);
            
            answerList.add(temp.get(commands[i][2]-1));
        } 
        
        int[] answer = new int[answerList.size()];
        
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}