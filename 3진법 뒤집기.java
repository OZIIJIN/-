import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> remainder = new ArrayList<>();
        
        while(true){
            int share = n/3;
            remainder.add(n%3);
            n = share;
            if(share==0){
                break;
            }
        }
        int[] reverse = new int[remainder.size()];
        for(int i = 0; i<reverse.length; i++){
            reverse[i] = remainder.get(reverse.length-i-1);
        }
        for(int i = 0; i<reverse.length; i++){
            answer += reverse[i]*Math.pow(3,i);
        }
        return answer;
    }
}
