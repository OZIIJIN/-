import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> divisor = new ArrayList<>();
        List<Integer> divisorCount = new ArrayList<>();
        for(int i = left; i <= right; i++){
            numbers.add(i);
        }
        for(int i = left; i <= right; i++){
            divisor.clear();
            for(int j = 1; j <= i; j++){
                if(i%j==0){
                    divisor.add(i);
                }
            }
            divisorCount.add(divisor.size());
        }
        for (int i=0; i<divisorCount.size(); i++){
            if(divisorCount.get(i)%2==0){
                answer += numbers.get(i);
            } else{
                answer -= numbers.get(i);
            }
        }
        return answer;
    }
}
