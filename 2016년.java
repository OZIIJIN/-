class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] lastday = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if(a > 1){
            for(int i = 1; i < a; i++){
                b += lastday[i-1];
            }
        }
        
        int remain = b%7;
        switch(remain){
            case 0:
                answer = "THU";
                break;
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
        }
        
        return answer;
    }
}
