import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++) {
            pQ.add(scoville[i]);
        }
        
        while(pQ.peek() < K) {
            if(pQ.size() == 1){
                return -1;
            }
            pQ.add(pQ.poll() + pQ.poll()*2);
            answer++;
        }
        
        return answer;
    }
}