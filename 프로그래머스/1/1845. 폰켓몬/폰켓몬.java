import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            hash.put(nums[i], 1);
        }
        
        Set<Integer> keyset = hash.keySet();
        int keys = keyset.size();
        
        if(keys <= n) {
            answer = keys;
        } else {
            answer = n;
        }
        
        return answer;
    }
    
}