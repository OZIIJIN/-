class Solution {
    public int solution(int n) {
        int answer = 0;
        int start = 1;
        int end = 1;
        int sum = 0;
        
        while (end <= n) {
            if (sum < n) {
                sum += end;
                end++;
            } else if (sum > n) {
                sum -= start;
                start++;
            } else {
                answer++;
                sum -= start;
                start++;
            }
        }
        
        return answer+1;
    }
}
