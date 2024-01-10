class Solution {
    public int[] solution(int n) {
        int oddcount = 0;
        for (int i=1; i <= n; i++){
            if(i%2 == 1){
                oddcount += 1;
            }
        }
        int[] answer = new int[oddcount];
        for (int i=0; i < answer.length; i++){
            answer[i] = 2*i +1;
        }
        return answer;
    }
}
