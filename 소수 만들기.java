import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(int[] nums) {
        int count = 0;
        List<Integer> answerList = new ArrayList<>();
        
        // 3개의 숫자 조합별 합 구하기
        for(int i = 0; i< nums.length-2; i++){
            for(int j = i+1; j< nums.length-1; j++){
                for(int k = j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    sumList.add(sum);
                    
                    //sum이 소수인지 판별
                    boolean isPrime = true;
                    for(int h = 2; h < sum; h++){
                        if(sum%h == 0){
                            isPrime = false;
                        }
                    }
                    if(isPrime){
                        count++;
                        answerList.add(sum);
                    }
                }
            }
        }

        return count;
    }
}
