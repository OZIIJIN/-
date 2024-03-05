import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i< lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                //여분의 체육복이 있는 학생이 잃어버린 경우
                if(lost[i] == reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                }
            }
        }
        
        //체육복 빌려주기
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}