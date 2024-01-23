import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] answer = new int[length];
        
        for(int n = 0; n < commands.length; n++){
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            
            List<Integer> list = new ArrayList<>();
            for(int a = i-1; a <= j-1; a++){
                list.add(array[a]);
            }
            Collections.sort(list);
            answer[n] = list.get(k-1);
            list.clear();
        }
        
        return answer;
    }
}
