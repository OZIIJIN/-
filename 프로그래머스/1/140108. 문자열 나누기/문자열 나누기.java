class Solution {
    public int solution(String s) {
        int answer = 0;
        int xcnt = 0;
        int notx = 0;
        char x = s.charAt(0);
        
        for(int i = 0; i < s.length(); i++){
            if(xcnt == notx){
                answer++;
                x = s.charAt(i);
            }
            if(x == s.charAt(i)){
                xcnt++;
            }else if(x != s.charAt(i)){
                notx++;
            }
            
        }
        
        return answer;
    }
}