import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int leftIndx = 0;
        int rightIndx = people.length-1;
        
        while(leftIndx <= rightIndx) {
            if(people[leftIndx] + people[rightIndx] <= limit) {
                leftIndx++;
            }
            rightIndx--;
            answer++;
        }
        
        return answer++;
        
    }

}