class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tlength = t.length();
        int plength = p.length();
        long num = Long.parseLong(p);
        for(int i = 0; i <= tlength - plength; i++){
            String part = t.substring(i,i + plength);
            if(Long.parseLong(part)<=num){
                answer++;
            }
        }
        return answer;
    }
}
