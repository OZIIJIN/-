import java.util.*;
class Solution {
    public int solution(int[] citations) {
        List<Integer> list = new ArrayList<>();
        
        for(int c : citations) {
            int count = over(citations, c);
            int min = Math.min(c, count);
            list.add(min);
        }
        
        int answer = Collections.max(list);
        
        return answer;
    }
    
    private int over(int[] citations, int num) {
        int count = 0;
        
        for(int i = 0; i < citations.length; i++) {
            if(num <= citations[i]) {
                count++;
            }
        }
        return count;
    }
}