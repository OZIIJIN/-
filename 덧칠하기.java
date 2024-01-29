class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0;
        
        for(int point : section){
            if(point > painted){
                answer++;
                painted = point + m -1;
            }
        }
        return answer;
    }
}
