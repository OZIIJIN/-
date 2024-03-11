class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = true;
        String result = Integer.toString(n, 2);
        int nOneCnt = countOne(result);
        
        while(check) {
            n++;
            String temp = Integer.toString(n, 2);
            if (nOneCnt == countOne(temp)) {
                check = false;
            }
        }
        return n;
    }
    public int countOne(String s) {
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }
}