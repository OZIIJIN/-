class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pcount = 0;
        int ycount = 0;
        char[] chararr = s.toCharArray();
        for (char c : chararr){
            if (c == 'p' || c == 'P'){
                pcount += 1;
            } else if (c == 'y' || c == 'Y'){
                ycount += 1;
            }
        }
        if (pcount == ycount){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}