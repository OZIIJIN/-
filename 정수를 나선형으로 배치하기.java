class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int start = 1;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        while(start<=n*n){
            for(int i = left; i <= right; i++){
                answer[left][i] = start++;
            }
            top++;
            for(int i = top; i <= bottom; i++){
                answer[i][right] = start++;
            }
            right--;
            for(int i=right; i>=left; i--){
                answer[bottom][i] = start++;
            }
            bottom--;
            for(int i=bottom; i>= top; i--){
                answer[i][left] = start++;
            }
            left++;
        }
        
        return answer;
    }
}
